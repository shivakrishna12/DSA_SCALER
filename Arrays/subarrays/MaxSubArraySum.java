package Arrays.subarrays;

import java.util.Scanner;

public class MaxSubArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array::");
        int length = sc.nextInt();

        int[] arr = new int[length];
        System.out.println("Enter Array Elements::");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }
}
