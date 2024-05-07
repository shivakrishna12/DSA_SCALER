package Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UniqueElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findUnique(arr));
    }

    public static int findUnique(int[] arr) {
        int unique = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j : arr) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        System.out.println("map::" + map);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                unique = entry.getKey();
                break;
            }
        }
        return unique;
    }
}
