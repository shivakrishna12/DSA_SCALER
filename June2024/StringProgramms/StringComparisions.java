package June2024.StringProgramms;

public class StringComparisions {
    public static void main(String[] args) {
        String name = "shiva";
        String name1 = new String("sivat");
        System.out.println("==::" + (name == name1));


        //
        // .equals
        System.out.println("equals::" + name.equals(name1));
        System.out.println("equalsIgnoreCase::" + name.equalsIgnoreCase(name1));

        System.out.println("equals::" + name.compareTo(name1));

    }
}
