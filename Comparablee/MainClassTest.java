package Comparablee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClassTest {
    public static void main(String[] args) {
        Student3 st1 = new Student3(1, "shiva", 26);
        Student3 st2 = new Student3(10, "shivaKrishna", 40);
        Student3 st3 = new Student3(6, "Arjun", 36);
        Student3 st4 = new Student3(19, "Thirupathi", 33);
        Student3 st5 = new Student3(11, "RK", 42);

        List<Student3> ls = new ArrayList<>();
        ls.add(st1);
        ls.add(st2);
        ls.add(st3);
        ls.add(st4);
        ls.add(st5);
        Collections.sort(ls, new SortByName());

        for (Student3 st : ls) {
            System.out.println(st.name);
        }

    }
}
