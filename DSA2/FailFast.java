package DSA2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFast {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> al = new CopyOnWriteArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        for (Integer num : al) {
            System.out.println(num);
            if (num == 30) {
                al.remove(num);
            }
        }
        System.out.println(al);
    }
}
