package June2024.StringProgramms;

public class ReverseString {
    public static void main(String[] args) {
        String name = "sharuk";  //kurahs
        for (int i = 0; i < name.length(); i = i + 2) {
            //  System.out.println(name.charAt(i));
        }
        // s  h  a  r   u   k
        //6
        //0   1  2          5

        String reverseName = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            //System.out.println(name.charAt(i));
            reverseName = reverseName + name.charAt(i);

        }
        System.out.println("reverseName::" + reverseName);
    }
}
