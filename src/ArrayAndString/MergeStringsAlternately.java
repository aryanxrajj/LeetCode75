package ArrayAndString;

public class MergeStringsAlternately {

    public String mergeAlternately(String word1, String word2) {
        char[] first = word1.toCharArray();
        char[] second = word2.toCharArray();

        StringBuilder result = new StringBuilder();

        int i = 0,j = 0;
        while(i < first.length && j < second.length){
            result.append(first[i]);
            result.append(second[i]);
            i++;
            j++;
        }

        while(i < first.length){
            result.append(first[i]);
            i++;
        }

        while(j < second.length){
            result.append(second[j]);
            j++;
        }

        return result.toString();
    }
}
