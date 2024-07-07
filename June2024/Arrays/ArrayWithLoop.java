package June2024.Arrays;

import java.util.Arrays;
import java.util.Scanner;

//Elements inserting into array by using loop
public class ArrayWithLoop {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        //brutforce way
       /* arr[0]=90;
        arr[1]=89;
        arr[2]=88;
        arr[3]=96;
        arr[4]=92;
        arr[5]=91;*/
       /* arr[0]=sc.nextInt();
        arr[1]=sc.nextInt();
        arr[2]=sc.nextInt();
        arr[3]=sc.nextInt();
        arr[4]=sc.nextInt();
        arr[5]=sc.nextInt();*/
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Array Elements Print ::" + Arrays.toString(arr));
    }

}
