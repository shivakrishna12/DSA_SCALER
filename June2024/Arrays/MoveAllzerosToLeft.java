package June2024.Arrays;

import java.util.Arrays;

public class MoveAllzerosToLeft {
    public static void main(String[] args) {
        int[] arr = {15, 13, 0, 8, 0, 9, 0};
        int j = arr.length - 1;
        int zerosCount = 0;
        while (j > 0) {
            if (zerosCount == j - 1) return;
            if (arr[j] == 0) {
                for (int i = j; i > 0; i--) {
                    arr[i] = arr[i - 1];
                }
                arr[0] = 0;
                zerosCount += 1;
                System.out.println("arr:::" + Arrays.toString(arr));
            } else {
                j--;
            }
        }
        System.out.println("arr:::" + Arrays.toString(arr));
    }
}
