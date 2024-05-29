package Arrays;

public class IsArraySorted {
    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(isArraySorted(arr));
    }

    public static boolean isArraySorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (!(arr[i - 1] <= arr[i])) {
                return false;
            }
        }
        return true;
    }
}
