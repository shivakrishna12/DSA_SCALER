package June2024.exceptionHandling;

import org.w3c.dom.ls.LSOutput;

public class ArithmeticException {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        //int c=a/b;
        //  System.out.println(c);

        int d = 10 % 0;    // 0
        System.out.println("d:" + d);
        int e = 10 % 3;   // 1
        System.out.println("e:" + e);


    }
}
