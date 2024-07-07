package June2024.StringProgramms;

import java.util.Scanner;

public class StringPrograms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter User name::");
        String name = sc.next();

        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }

    }
}
