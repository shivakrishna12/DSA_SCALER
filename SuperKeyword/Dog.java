package SuperKeyword;

public class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    public static void main(String[] args) {

        String str = "Hello world:)";
        System.out.println(str.replaceAll("[a-zA-Z0-9]", ""));
    }
}
