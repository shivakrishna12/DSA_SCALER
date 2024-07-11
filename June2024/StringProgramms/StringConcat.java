package June2024.StringProgramms;

public class StringConcat {
    public static void main(String[] args) {
        String firstName = "shiva krishna";
        String lastName = "Duddilla";
        String fullName = firstName + " " + lastName;
        System.out.println("fullname::" + fullName);

        char letter = firstName.charAt(2);
        lastName = lastName + letter;
        System.out.println("char appending to lastname:::" + lastName);


        String fullname2 = firstName.concat(" " + lastName).concat("  Patel");
        System.out.println("fullName:: " + fullname2);


    }
}
