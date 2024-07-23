package June2024.oops;


class A {
    int addition(int a, int b) {
        return a + b;
    }
}

class B extends A {

    @Override
    int addition(int a, int b) {
        return a + b;
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.addition(10, 20));
    }


}
