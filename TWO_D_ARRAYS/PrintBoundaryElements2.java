package TWO_D_ARRAYS;

public class PrintBoundaryElements2 {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        arr[0] = new int[]{1, 2, 3, 4};
        arr[1] = new int[]{5, 6, 7, 8};
        arr[2] = new int[]{9, 10, 11, 12};
        arr[3] = new int[]{13, 14, 15, 16};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == 0 || i == arr.length - 1 || j == 0 || j == arr[i].length - 1) {
                    System.out.print(arr[i][j] + " ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

}
