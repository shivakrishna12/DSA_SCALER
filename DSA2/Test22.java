package DSA2;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Test22 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 9, 2123, 91, 614, 581);
        List<Integer> outputList = new ArrayList<>();
        TreeSet<Integer> ts = new TreeSet<>();
        for (Integer num : numbers) {
            if (num > 10) {
                int tempNum = Math.abs(num);
                while (tempNum >= 100) {
                    tempNum /= 10;
                }
                tempNum = tempNum % 10;
                if (tempNum == 1) {
                    outputList.add(num);
                }
            }
        }
        System.out.println("outputList :::" + outputList);
    }


}
