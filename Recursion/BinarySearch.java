package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 4, 6, 8, 9, 11};
        int searchValue = 8;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (searchValue == arr[mid]) {
                System.out.println("true");
                break;
            } else if (searchValue < arr[mid]) {
                end = mid - 1;
            } else if (searchValue > arr[mid]) {
                start = mid + 1;
            }
        }

    }
}
