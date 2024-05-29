package Sorting;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] A = {2, 5, 9, 12, 15};
        int[] B = {3, 6, 8, 10, 16};

        int[] ans = new int[A.length + B.length];

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < A.length && j < B.length) {
            if (A[i] < B[j]) {
                ans[k] = A[i];
                i++;
            } else {
                ans[k] = B[j];
                j++;
            }
            k++;
        }
        System.out.println("Final merged Array::" + Arrays.toString(ans));
    }
}
