package June2024.methodsPractice;

public class PalindromeString {
    public static void main(String[] args) {
        String name = "madamaa";
        //reverse
        String reversedName = getReverseWord(name);
        //compare
        boolean result = isPalindrome(name, reversedName);
        System.out.println("is Palindrome :::" + result);

    }

    public static String getReverseWord(String name) {
        String reversedName = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reversedName += name.charAt(i);
        }
        return reversedName;
    }

    public static boolean isPalindrome(String name, String reversedName) {
        //compare original and reversed values
        if (name.equals(reversedName)) {
            return true;
        }
        return false;
    }
}
