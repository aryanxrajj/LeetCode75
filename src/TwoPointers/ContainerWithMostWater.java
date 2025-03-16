package TwoPointers;

import java.beans.Introspector;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }

    public static int maxArea(int[] arr) {
        int first = 0;
        int second = arr.length - 1;
        int max = Integer.MIN_VALUE;

        while(first < second){
            int width = second - first;
            int height = Math.min(arr[first],arr[second]);
            int area = width * height;
            max = Math.max(area,max);

            if(arr[first] > arr[second]){
                second--;
            }else {
                first++;
            }
        }

        return max;
    }
}
