package Arrays;

import java.util.Scanner;

/*find the even and odd numbers from given array*/
public class EvenOddNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Number of test cases::");
        int testCases = sc.nextInt();
        int k = 0;
        while (k < testCases) {
            System.out.println("enter length of array::");
            int length = sc.nextInt();
            int[] arr = new int[length];
            System.out.println("enter Array Elements::");
            for (int i = 0; i < length; i++) {
                arr[i] = sc.nextInt();
            }
            int odd_count = 0;
            int even_count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    even_count += 1;
                } else {
                    odd_count += 1;
                }
            }
            System.out.println(Math.abs(odd_count - even_count));
            k++;
        }
    }
}
