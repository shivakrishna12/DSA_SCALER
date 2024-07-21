package June2024.oops;

public class MainClass {

    public static void main(String[] args) {
        //by Creating Obj
        Employee employee = new Employee();
        employee.id = 10;
        employee.name = "shiva krishna";
        employee.salary = 10000;
        employee.mobileNumber = 8978557559L;
        employee.bloodGroup = "A Positive";

        System.out.println(employee.id);
        System.out.println(employee.name);
        System.out.println(employee.salary);
        System.out.println(employee.bloodGroup);
        System.out.println(employee.mobileNumber);

        Employee emp2 = new Employee(11, "shivakrishna", "A Positive", 20000, 8978557559L);


    }
}
