package Arrays.subarrays;

import java.util.Arrays;

public class SubArrayWithPrefixDSA21 {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[][] arr1 = new int[4][3];
        arr1[0] = new int[]{3, 6, 1};
        arr1[1] = new int[]{2, 7, 3};
        arr1[2] = new int[]{4, 6, 5};
        arr1[3] = new int[]{1, 5, -4};

        for (int i = 0; i < arr1.length; i++) {
            arr[arr1[i][0]] += arr1[i][2];
            if ((arr1[i][1] + 1) < arr.length) {
                arr[arr1[i][1] + 1] -= arr1[i][2];
            }
            System.out.println(Arrays.toString(arr));
        }
        //System.out.println(Arrays.toString(arr));
        int[] ps = new int[arr.length];
        ps[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            ps[i] = ps[i - 1] + arr[i];
        }
        System.out.println("final PrefixSum::" + Arrays.toString(ps));
    }
}
