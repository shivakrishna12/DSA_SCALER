package Java8_Features;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
        list.stream().forEach(item -> System.out.println(item));
        List<Integer> updatedList = list.stream().map(item -> item * 10).collect(Collectors.toList());

        updatedList.stream().forEach(System.out::println);

        updatedList.stream().filter(item -> item > 200).forEach(System.out::println);

    }

}
