package June2024.oops;

public class Employee {
    int id;
    String name;
    String bloodGroup;
    double salary;
    long mobileNumber;

    //default constructor
    public Employee() {
        System.out.println("Employee Constructor");
    }

    public Employee(int id, String name) {
        //assigning parameters
    }

    //Parameterized Constructor
    public Employee(int id, String name, String bloodGroup, double salary, long mobileNumber) {
        this.id = id;
        this.name = name;
        this.bloodGroup = bloodGroup;
        this.salary = salary;
        this.mobileNumber = mobileNumber;

        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
        System.out.println(bloodGroup);
        System.out.println(mobileNumber);

    }

}
