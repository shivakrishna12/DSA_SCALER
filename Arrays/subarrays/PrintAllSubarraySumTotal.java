package Arrays.subarrays;

public class PrintAllSubarraySumTotal {
    public static void main(String[] args) {
        int[] arr = new int[]{3, -2, 6};
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += Math.abs(arr[i] * (arr.length - i));
        }
        System.out.println("total Sum::" + sum);
    }
}
