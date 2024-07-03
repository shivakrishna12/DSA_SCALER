package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {8, 33, 4, 9, 7, 1, -1, 0, 88, 33, 22};
        System.out.println(Arrays.toString(mergeSort(arr, 0, arr.length - 1)));
    }

    public static int[] mergeSort(int[] arr, int low, int high) {
        if (low == high) {
            int[] sa = new int[1];
            sa[0] = arr[low];
            return sa;
        }
        int mid = low + (high - low) / 2;
        int[] left = mergeSort(arr, low, mid);
        int[] right = mergeSort(arr, mid + 1, high);
        int[] ans = merge(left, right);
        return ans;
    }

    static int[] merge(int[] left, int[] right) {
        int[] ans = new int[left.length + right.length];
        int n = 0;
        int m = 0;

        int k = 0;

        while (n < left.length && m < right.length) {
            if (left[n] < right[m]) {
                ans[k] = left[n];
                n++;
            } else {
                ans[k] = right[m];
                m++;
            }
            k++;
        }
        while (n < left.length) {
            ans[k] = left[n];
            n++;
            k++;
        }
        while (m < right.length) {
            ans[k] = right[m];
            m++;
            k++;
        }
        return ans;
    }
}
