package Stack;

import java.util.Stack;

public class RemovingStarsFromAString {
    public static void main(String[] args) {
        String s = "leet**cod*e";
        System.out.println(removeStars(s));
    }

    public static String removeStars(String s) {
        char[] ch = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < ch.length; i++){
            if(Character.isLetter(ch[i])){
                stack.push(ch[i]);
            }else{
                stack.pop();
            }
        }
        StringBuilder result = new StringBuilder();

        while(!stack.isEmpty()){
            result.append(stack.pop());
        }

        result.reverse();

        return result.toString();
    }
}
