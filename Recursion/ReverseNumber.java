package Recursion;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 12345;
        int reverseNum = 0;
        while (n > 0) {
            int ld = n % 10;
            reverseNum = (reverseNum * 10) + ld;
            n /= 10;
        }
        System.out.println(reverseNum);
    }
}
