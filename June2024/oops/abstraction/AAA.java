package June2024.oops.abstraction;

public class AAA extends AbstractClass {

    public static void main(String[] args) {
        AAA aa = new AAA();
        aa.display();
    }

    @Override
    public void display() {
        System.out.println("this is override display method from AAA class");
    }
}
