package June2024.StringProgramms;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word ::");
        String word = sc.next();
        //equals()
        //==
        //compareTo


        long startTime = System.currentTimeMillis();
        //1.reverse the given word
        //2.compare both original word and reverse word
        //3.if original word and reverse word same, then its palindrome word otherwise not palindrome
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }
        if (word.equals(reverse)) {
            System.out.println("its palindrome");
        } else {
            System.out.println("not palindrome");
        }
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        System.out.println("executionTime----" + executionTime);
    }
}
