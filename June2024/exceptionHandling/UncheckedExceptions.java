package June2024.exceptionHandling;

import java.util.Locale;

public class UncheckedExceptions {
    public static void main(String[] args) {
        try {
            String name = null;  //default value=null
            try {
                System.out.println(name.toLowerCase());
            } catch (NullPointerException npe) {
                System.out.println(npe.getMessage());
            }


            String name1 = "sharuk";
            System.out.println("name1-->" + name1.toUpperCase());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
