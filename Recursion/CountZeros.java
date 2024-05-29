package Recursion;

public class CountZeros {
    public static void main(String[] args) {
        int num = 30204;
        int count = 0;
        String numStr = Integer.toString(num);
        for (int i = 0; i < numStr.length(); i++) {
            if (numStr.charAt(i) == '0') {
                count += 1;
            }
        }
        System.out.println(count);
    }
}
