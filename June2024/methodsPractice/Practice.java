package June2024.methodsPractice;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        //product of given two elements
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("addition:::" + additionOfTwoNumbers(a, b));
        System.out.println("Subtraction:::" + subtractionOfTwoNumbers(a, b));
        System.out.println("product:::" + productOfTwoNumbers(a, b));
        System.out.println("division:::" + divisionOfTwoNumbers(a, b));


    }

    public static int additionOfTwoNumbers(int aa, int bb) {
        int addResult = aa + bb;
        return addResult;
    }

    public static int subtractionOfTwoNumbers(int aa, int bb) {
        int subtractionResult = aa - bb;
        return subtractionResult;
    }

    public static int productOfTwoNumbers(int aa, int bb) {
        int product = aa * bb;
        return product;
    }

    public static int divisionOfTwoNumbers(int aa, int bb) {
        int divisionResult = aa / bb;
        return divisionResult;
    }
}
