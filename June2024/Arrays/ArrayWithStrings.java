package June2024.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayWithStrings {
    public static void main(String[] args) {
        char[] charArr1 = {'a', 'b', 'c'};
        char[] charArr2 = new char[]{'a', 'b', 'c', 'd'};

        char[] charArr3 = new char[5];
        charArr3[0] = 'a';
        charArr3[1] = 'b';
        charArr3[2] = 'c';
        charArr3[3] = 'd';
        charArr3[4] = 'e';


        String[] arr = new String[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Student Names");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }
       /* int i=0;
        while(i<arr.length){
            arr[i]=sc.next();
            i++;
        }*/

        System.out.println("String names ::" + Arrays.toString(arr));
    }
}
