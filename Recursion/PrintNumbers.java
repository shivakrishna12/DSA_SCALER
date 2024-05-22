package Recursion;

public class PrintNumbers {
    public static void main(String[] args) {
        printNums(5);
    }

    public static void printNums(int num) {
        if (num == 1) {
            System.out.print(num + " ");
            return;
        }
        printNums(num - 1);
        System.out.print(num + " ");
    }
}
