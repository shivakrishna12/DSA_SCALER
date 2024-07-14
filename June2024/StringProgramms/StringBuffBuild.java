package June2024.StringProgramms;

public class StringBuffBuild {
    public static void main(String[] args) {
        StringBuffer name = new StringBuffer("Shiva Krishna");
        System.out.println("name::" + name);
        name.append(" Duddilla");
        System.out.println("After Append::" + name);


        String name1 = "shiva";
        name1.concat("krishna");
        System.out.println("name1:::" + name1);

        StringBuilder name2 = new StringBuilder("Shiva Krishna");
        System.out.println("name::" + name2);
        name2.append(" Duddilla");
        System.out.println("After Append::" + name2);
    }
}
