package June2024.oops;


class A {

    int addition(int a, int b) {

        return a + b;
    }

}

public class MethodOverriding extends A {


    public static void main(String[] args) {

    }

    @Override
    int addition(int a, int b) {
        return a + b;
    }

}
