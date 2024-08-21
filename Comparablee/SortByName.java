package Comparablee;

import java.util.Comparator;

public class SortByName implements Comparator<Student3> {

    @Override
    public int compare(Student3 o1, Student3 o2) {
        return o1.name.compareTo(o2.name);
    }
}
