package TwoPointers;

import java.util.Arrays;

public class MaximumNumbersOfKSumPairs {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(maxOperations(arr,5));
    }

    public static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length - 1;
        int count = 0;

        while(start < end){
            int sum = nums[start] + nums[end];
            if(sum == k){
                count++;
                start++;
                end--;
            }else if (sum > k) {
                end--;
            }else{
                start++;
            }


        }

        return count;
    }
}
