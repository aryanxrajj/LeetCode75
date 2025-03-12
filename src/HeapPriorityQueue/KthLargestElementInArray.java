package HeapPriorityQueue;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {3,2,1,5,6,4};
        System.out.println(findKthLargest(arr,2));
    }

    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < nums.length ; i++){
            max.add(nums[i]);
        }

        int result = 0,count = 0;
        while(!max.isEmpty() && count < k){
            result = max.poll();
            count++;
        }

        return result;
    }
}
