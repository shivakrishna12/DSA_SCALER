package June2024.exceptionHandling;

import java.io.*;

public class Checked {
    public static void main(String[] args) {
        File file = new File("D:\\datasync424_azure\\source\\class1.txt");
        try {
            FileReader fileReader = new FileReader(file);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
