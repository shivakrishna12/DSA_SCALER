package June2024;

public class SwappingProgram {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // a=20;b=10;
        System.out.println("a--" + a);
        System.out.println("b---" + b);
        int extra = a;
        a = b;
        b = extra;
        System.out.println("after a=" + a);
        System.out.println("after b=" + b);
    }
}
