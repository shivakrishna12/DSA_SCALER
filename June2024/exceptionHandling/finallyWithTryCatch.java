package June2024.exceptionHandling;

public class finallyWithTryCatch {

    public static void main(String[] args) {
        String value = null;
        String value1 = "";
        try {
            int length = value.length();
            int aa = Integer.parseInt(value1);
        } finally {
            System.out.println("finally block executed");
        }

    }
}
