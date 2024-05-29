public class BinarySearch {
    public static void main(String[] args) {
        int n = 9;
        int m = 1953125;
        int prod = n;
        int count = 1;
        while (prod < m) {
            prod *= n;
            count++;
            if (prod == m) {
                System.out.println(count);
                return;
            }

        }
        System.out.println(-1);
    }

}
