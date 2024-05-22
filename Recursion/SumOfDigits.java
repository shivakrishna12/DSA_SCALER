package Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 1342;
        System.out.println(sumOfDigits(n));
    }

    public static long sumOfDigits(int n) {
        if (n <= 0) {
            return 0;
        }
        int ld = n % 10;
        return ld + sumOfDigits(n / 10);
    }
}
