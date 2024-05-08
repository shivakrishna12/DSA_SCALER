package TWO_D_ARRAYS;

public class PrintBoundaryElements {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        arr[0] = new int[]{1, 2, 3, 4};
        arr[1] = new int[]{5, 6, 7, 8};
        arr[2] = new int[]{9, 10, 11, 12};
        arr[3] = new int[]{13, 14, 15, 16};

        for (int i = 0; i < arr[0].length; i++) {
            System.out.print(arr[0][i] + " ");
        }
        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i][arr[0].length - 1] + " ");
        }
        for (int i = arr[0].length - 1; i >= 0; i--) {
            System.out.print(arr[arr.length - 1][i] + " ");
        }
        for (int i = arr.length - 2; i >= 0; i--) {
            System.out.print(arr[i][0] + " ");
        }
    }
}
