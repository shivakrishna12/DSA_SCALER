package Comparablee;

public class Student implements Comparable<Student> {
    Integer id;
    String name;
    int age;
    String address;
    int marks;

    Student(int id, String name, int age, int marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        if (o.id > this.id) {
            return -1;
        } else {
            return 1;
        }
    }
}
