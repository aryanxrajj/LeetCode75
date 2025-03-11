package HashMapsAndSet;

import java.util.Arrays;

public class DetermineifTwoStringsAreClose {
    public static void main(String[] args) {
        String word1 = "cabbba";
        String word2 = "abbccc";

        System.out.println(closeStrings(word1,word2));
    }

    public static boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) return false;

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        // Populate frequency arrays
        for (char c : word1.toCharArray()) freq1[c - 'a']++;
        for (char c : word2.toCharArray()) freq2[c - 'a']++;

        // Check if both words have the same unique characters
        for (int i = 0; i < 26; i++) {
            if ((freq1[i] > 0) != (freq2[i] > 0)) return false;
        }

        // Frequency bucket arrays
        int[] bucket1 = new int[word1.length() + 1];
        int[] bucket2 = new int[word2.length() + 1];

        // Count occurrences of each frequency
        for (int i = 0; i < 26; i++) {
            bucket1[freq1[i]]++;
            bucket2[freq2[i]]++;
        }

        return Arrays.equals(bucket1, bucket2);
    }
}
