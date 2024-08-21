package Sorting2;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 8, 4, 9, 3, 10};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
