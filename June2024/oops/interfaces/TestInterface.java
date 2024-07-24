package June2024.oops.interfaces;

public interface TestInterface {
    static int subtraction(int a, int b) {
        return a - b;
    }

    static void main(String[] args) {
        System.out.println("main method in interface");
    }

    void display();

    default int addition(int a, int b) {
        return a + b;
    }

}
