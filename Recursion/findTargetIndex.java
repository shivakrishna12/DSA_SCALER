package Recursion;

public class findTargetIndex {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 18, 9, 90, 54, 33, 28,};
        int target = 100;
        System.out.println(findTargetIndex(arr, target, 0));
    }

    public static int findTargetIndex(int[] arr, int target, int s) {
        if (s == arr.length) return -1;
        if (arr[s] == target) {
            return s;
        }
        return findTargetIndex(arr, target, s + 1);
    }
}
