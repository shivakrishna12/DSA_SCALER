package Arrays;

import java.util.Scanner;

public class NegativeIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the Array::");
        int len = sc.nextInt();
        int[] arr = new int[len];
        int i = 0;
        while (i < len) {
            arr[i] = sc.nextInt();
            i++;
        }
        getNegativeNumbers(arr);
    }

    public static void getNegativeNumbers(int[] arr) {
        for (int num : arr) {
            if (num < 0) {
                System.out.print("Negative Numbers from given Array::" + num + " ");
            }
        }
    }
}
