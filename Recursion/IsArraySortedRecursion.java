package Recursion;

public class IsArraySortedRecursion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 8, 9, 12, 5};
        System.out.println(isArraySorted(arr, 0, 1));

    }

    static boolean isArraySorted(int[] arr, int first, int second) {
        if (second == arr.length) {
            return true;
        }
        if (!(arr[first] <= arr[second])) {
            return false;
        }
        first += 1;
        second += 1;
        return isArraySorted(arr, first, second);
    }
}
