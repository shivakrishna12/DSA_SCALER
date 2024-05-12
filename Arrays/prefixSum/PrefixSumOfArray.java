package Arrays.prefixSum;

import java.util.Arrays;
import java.util.Scanner;

public class PrefixSumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the Array::");
        int length = sc.nextInt();
        int[] arr = new int[length];
        System.out.println("Enter Array Elements::");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] prefixSum = new int[length];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            prefixSum[i] = sum;
        }
        System.out.println("Prefix Sum Array :: " + Arrays.toString(prefixSum));
    }
}
