package June2024;

import java.util.Scanner;

public class SwappingWithInputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter aa value::");
        int aa = sc.nextInt();
        System.out.println("Enter bb value::");
        int bb = sc.nextInt();
        // a=20;b=10;
        System.out.println("a--" + aa);
        System.out.println("b---" + bb);
        int extra = aa;
        aa = bb;
        bb = extra;
        System.out.println("after a=" + aa);
        System.out.println("after b=" + bb);
    }
}
