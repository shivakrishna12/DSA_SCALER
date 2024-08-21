package Comparablee;

import java.util.Comparator;

public class SortById implements Comparator<Student3> {
    @Override
    public int compare(Student3 o1, Student3 o2) {
        return Integer.compare(o1.id, o2.id);
    }
}
