package Arrays.subarrays;

import java.util.ArrayList;

public class MaxSumSubArray {
    public static void main(String[] args) {
        int startIndex = -1;
        int endIndex = -1;
        int maxSum = Integer.MIN_VALUE;
        int[] arr = new int[]{-3, 2, 4, -1, 3, -4, 3};
        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                if (maxSum < sum) {
                    maxSum = sum;
                    startIndex = i;
                    endIndex = j;
                }
            }
        }
        System.out.println("StartIndex---" + startIndex);
        System.out.println("endIndex---" + endIndex);
        for (int i = startIndex; i <= endIndex; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
