package TWO_D_ARRAYS;

import java.util.Scanner;

public class PrintFirstColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][2];
        System.out.println("Enter Matrix elements::");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0]);
        }
    }
}
/* input
1 2
3 4
5 6

Output
1
3
5
 */

