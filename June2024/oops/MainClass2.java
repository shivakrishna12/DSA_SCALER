package June2024.oops;

public class MainClass2 {
    public static void main(String[] args) {
        Employee2 emp2 = new Employee2();
        emp2.setId(10);
        emp2.setName("sharuk");
        emp2.setSalary(-10000);
        emp2.setBloodGroup("A Positive");
        emp2.setMobileNumber(8978557559L);
        emp2.setAge(-20);
        System.out.println(emp2.toString());

        System.out.println(emp2.getMobileNumber());

    }
}
