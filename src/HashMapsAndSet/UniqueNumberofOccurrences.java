package HashMapsAndSet;

import java.util.HashMap;

public class UniqueNumberofOccurrences {
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,1,3};
        boolean result = uniqueOccurrences(arr);
        System.out.println(result);
    }

    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> result = new HashMap<>();


        for(int num : arr){
            map.put(num, map.getOrDefault(num,0) + 1);
        }

        for(int num : map.values()){
            result.put(num, result.getOrDefault(num,0) + 1);
        }

        for(int num : result.values()){
            if(num > 1){
                return false;
            }
        }

        return true;
    }
}
