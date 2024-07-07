package June2024.StringProgramms;

import java.util.Scanner;

public class CharCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter User name::");
        String name = sc.next();
        //sharuk
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'd') {
                System.out.println("d char present in given name");
            }
        }
    }
}
