package June2024.Arrays;

public class BasicArray {
    public static void main(String[] args) {
        int[] arr = {90, 80, 70, 60, 50, 40, 30, 20, 10};
        //0   1   2 3   4  5  6  7  8  9
        System.out.println("length of the given array:::" + arr.length);
        System.out.println("2nd index Elements::" + arr[2]); //70
/*
        System.out.println(arr[0]+5);
        System.out.println(arr[1]+5);
        System.out.println(arr[2]+5);
        System.out.println(arr[3]+5);
        System.out.println(arr[4]+5);
        System.out.println(arr[5]+5);
        System.out.println(arr[6]+5);
        System.out.println(arr[7]+5);
        System.out.println(arr[8]+5);
        System.out.println(arr[9]+5);*/

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + 5);
        }

    }
}
