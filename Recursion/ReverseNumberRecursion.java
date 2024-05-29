package Recursion;

public class ReverseNumberRecursion {
    public static void main(String[] args) {
        int n = 12345;

    }

    static int reverseNum(int n) {
        if (n <= 0) {
            return 0;
        }
        int ld = n % 10;
        return ld + reverseNum(n / 10);
    }
}
