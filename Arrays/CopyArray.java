package Arrays;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] A = new int[]{10, 20, 30, 40, 50};
        int B = 5;
        int[] c = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            c[i] = A[i] + B;
        }
        System.out.println("new Array::" + Arrays.toString(c));
    }
}
