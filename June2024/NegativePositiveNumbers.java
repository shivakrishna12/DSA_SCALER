package June2024;

import java.util.Scanner;

public class NegativePositiveNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number ::");
        int number = sc.nextInt();
        if (number >= 0) {
            System.out.println("Given Number is Positive");
        } else {
            System.out.println("Given Number is Negative");
        }
    }
}
