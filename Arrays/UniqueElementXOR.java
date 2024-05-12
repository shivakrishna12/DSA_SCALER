package Arrays;

import java.util.Scanner;

public class UniqueElementXOR {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findUnique(arr));
    }

    public static int findUnique(int[] arr) {
        int unique = 0;
        for (int val : arr) {
            unique ^= val;
            System.out.println("unique val::" + unique);
        }
        return unique;
    }
}