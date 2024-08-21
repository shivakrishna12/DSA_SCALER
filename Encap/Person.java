package Encap;

public class Person {
    private final String name;
    private final int age;
    private final int salary;

    Person(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public static void main(String[] args) {

        Person p1 = new Person("Arjun", 2, 20000);

        System.out.println(p1.getName());

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }
}
