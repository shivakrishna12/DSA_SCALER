package Comparablee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListt {
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<>();
        Student st1 = new Student(10, "shivakrishna", 30, 500);
        Student st2 = new Student(1, "Arjun", 33, 508);
        Student st3 = new Student(13, "Srithi", 36, 530);
        Student st4 = new Student(11, "Thirupathi", 40, 520);
        Student st5 = new Student(9, "Ramakrishna", 45, 510);
        al.add(st1);
        al.add(st2);
        al.add(st3);
        al.add(st4);
        //Sorting (default sorting is Asending order)
        Collections.sort(al);

        //Sorting (default sorting is desending order)
        //  Collections.sort(al, Comparator.reverseOrder());
        for (Student st : al) {
            System.out.println(st.id);
        }


    }
}
