package June2024.oops.interfaces;

public class TestA implements TestInterface {
    public static void main(String[] args) {
        TestA a = new TestA();
        a.addition(10, 20);
    }

    @Override
    public void display() {

    }

    @Override
    public int addition(int a, int b) {
        return TestInterface.super.addition(a, b);
    }
}
