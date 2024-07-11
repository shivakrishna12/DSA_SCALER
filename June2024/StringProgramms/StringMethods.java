package June2024.StringProgramms;

import java.util.Locale;
import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name ::");
        String name = sc.nextLine();
        System.out.println("name length::" + name.length());
        System.out.println("convert to UpperCase::" + name.toUpperCase());

        String upperString = name.toUpperCase();
        System.out.println("convert to UpperCase::" + name.toLowerCase());
        System.out.println("substring::(0,3)-->0,1,2:::" + name.substring(0, 3));
        name = name.trim();

        System.out.println("trim usecase ::" + name);
        System.out.println("length of the String after trim() ::" + name.length());


    }
}
