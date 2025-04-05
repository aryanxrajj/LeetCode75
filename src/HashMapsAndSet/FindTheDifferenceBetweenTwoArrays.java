package HashMapsAndSet;

import java.util.*;

public class FindTheDifferenceBetweenTwoArrays {
    public static void main(String[] args) {
        int[] num1 = {1,2,3};
        int[] num2 = {2,4,6};

        System.out.println(findDifference(num1,num2));
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Set<Integer> result1 = new HashSet<>();
        Set<Integer> result2 = new HashSet<>();

        for(int nums : nums1) result1.add(nums);
        for(int nums : nums2) result2.add(nums);

        for(int n : result1){
            if(!result2.contains(n)){
                list1.add(n);
            }
        }

        for(int n : result2){
            if(!result1.contains(n)){
                list2.add(n);
            }
        }

        ans.add(list1);
        ans.add(list2);

        return ans;
    }
}
