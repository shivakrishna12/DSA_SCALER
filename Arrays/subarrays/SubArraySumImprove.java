package Arrays.subarrays;

public class SubArraySumImprove {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 10, 9, 6};
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        for (int s = 0; s < arr.length; s++) {
            for (int e = s; e < arr.length; e++) {
                if (s == 0) {
                    System.out.println(prefixSum[e]);
                } else {
                    System.out.println(prefixSum[e] - prefixSum[s - 1]);
                }
            }
        }
    }
}
