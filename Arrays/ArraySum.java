import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        System.out.println("Sum of array Elements ::"+arraySum(length));
    }
    public static long arraySum(int length) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[length];
        long sum = 0;
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        return sum;
    }
}
