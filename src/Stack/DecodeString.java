package Stack;

import java.util.*;

public class DecodeString {
    public static String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int num = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0'); // Handle multi-digit numbers
            } else if (c == '[') {
                countStack.push(num);
                stringStack.push(currentString);
                currentString = new StringBuilder();
                num = 0;
            } else if (c == ']') {
                int repeatTimes = countStack.pop();
                StringBuilder decoded = stringStack.pop();

                for (int i = 0; i < repeatTimes; i++) {
                    decoded.append(currentString);
                }
                currentString = decoded;
            } else {
                currentString.append(c); 
            }
        }
        return currentString.toString();
    }

    public static void main(String[] args) {
        System.out.println(decodeString("3[a]2[bc]")); // Output: "aaabcbc"
        System.out.println(decodeString("3[a2[c]]"));  // Output: "accaccacc"
        System.out.println(decodeString("2[abc]3[cd]ef")); // Output: "abcabccdcdcdef"
    }
}
