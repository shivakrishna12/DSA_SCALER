package June2024.exceptionHandling;

public class ArrayIndexOutBoundsExp {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("arr length::" + arr.length);
        System.out.println("arr oth index element ::" + arr[0]);
        System.out.println("last index element ::" + arr[arr.length - 1]);

        System.out.println("last index element ::" + arr[100]);
    }
}
