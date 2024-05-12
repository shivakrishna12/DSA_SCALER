package Arrays.subarrays;

import java.util.ArrayList;
import java.util.Scanner;

public class SubArraysSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array::");
        int length = sc.nextInt();

        int[] arr = new int[length];
        System.out.println("Enter Array Elements::");
        for (int i = 0; i < arr.length; i++) {

        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + arr[k];
                    if (max < sum) {
                        max = sum;
                    }
                }

            }
        }
        System.out.println("Maximum Subarray Sum ::" + max);
    }
}
