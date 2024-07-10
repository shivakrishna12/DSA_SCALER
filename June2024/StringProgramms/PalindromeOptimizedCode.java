package June2024.StringProgramms;

import java.util.Scanner;

public class PalindromeOptimizedCode {
    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter word ::");
            String word = sc.next();


            //equals()
            //==
            //compareTo


            long startTime = System.currentTimeMillis();
            long endTime = 0L;
            //1.reverse the given word
            //2.compare both original word and reverse word
            //3.if original word and reverse word same, then its palindrome word otherwise not palindrome
            //madam
            //0  4
            //1  3
            //2  2
            int startIndex = 0;
            int endIndex = word.length() - 1;
            while (startIndex < endIndex) {
                if (word.charAt(startIndex) != word.charAt(endIndex)) {
                    System.out.println("its not palindrome");
                    endTime = System.currentTimeMillis();
                    long executionTime = endTime - startTime;
                    System.out.println("executionTime----" + executionTime);
                    return;
                }
                startIndex++;
                endIndex--;
            }
            System.out.println("its palindrome");
            endTime = System.currentTimeMillis();
            long executionTime = endTime - startTime;
            System.out.println("executionTime----" + executionTime);
        }
    }
}
