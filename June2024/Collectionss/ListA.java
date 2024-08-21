package June2024.Collectionss;

import java.util.ArrayList;
import java.util.Iterator;

public class ListA {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        al.add(60);
        al.add(60);
        al.add(60);
        al.add(60);

        //for loop
        for (int i = 0; i < al.size(); i++) {
            System.out.println("i---" + al.get(i));
            //  al.add(500);
            al.remove(3);
        }
        //forEach loop
        System.out.println("for Each loop Example::::");
        int sizeOfArraylist = 0;
        for (Integer item : al) {
            System.out.println(item);
            al.add(500);
            sizeOfArraylist += 1;
        }
        System.out.println("size of the arryList:::" + sizeOfArraylist);

        //Itertor
        System.out.println("Iterator Example::::");
        Iterator<Integer> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
            al.add(500);
        }



     /*   int[] arr=new int[]{10,20,30,40,50,60};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }*/

        //  internal --array (10) 10th insert --> 15    _>  15+7   22


    }
}
