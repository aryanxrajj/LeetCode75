package TwoPointers;

public class IsSubsequence {
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";

        System.out.println(isSubsequence(s,t));

    }

    public static boolean isSubsequence(String s, String t) {
        int first = 0;
        int second = 0;

        while(first < s.length() && second < t.length()){
            if(s.charAt(first) == t.charAt(second)){
                first++;
            }
            second++;
        }

        return first == s.length();
    }
}
