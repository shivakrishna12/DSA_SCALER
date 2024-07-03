package June2024;

public class Test {
    public static void main(String[] args) {    //method Signature
        System.out.println("Hello Sharukhhhh");

        //Non-static method calling
        Test test = new Test();
        test.main123();

        //static method calling
        driving();

    }

    public static void driving() {
        System.out.println("Hello shiva");
    }

    private void main123() {
        System.out.println("Hello shiva");
    }
}
