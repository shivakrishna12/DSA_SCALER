package June2024.Arrays;

public class WhileLoopExample {
    public static void main(String[] args) {
        //print 1 to 50 numbers by using while loop
        //1 2 3 .......49 50
       /* for(int k=1;k<=50;k++){
            System.out.println(k);
        }*/
/*
        //while
        int i=1;
         while(i<=50){
             System.out.println(i);
          i++;
         }*/

        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int j = 0;
        while (j < arr.length) {
            System.out.println(arr[j]);
            j += 2;
        }

    }
}
//10  30  50  70  90