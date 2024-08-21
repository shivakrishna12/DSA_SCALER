package June2024.Collectionss;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ArrayListt {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(90);
        list.add(50);
        list.add(80);
        list.add(88);
        list.add(60);
        list.add(69);
        list.add(90);
        list.add(100);
        System.out.println(list);
        Iterator<Integer> ii = list.iterator();
        while (ii.hasNext()) {
            Integer item = ii.next();
            if (item > 50) {
                System.out.println(item);
            }
        }

        System.out.println("===============");
        //stream api
        list.stream().filter(item -> item > 50).forEach(System.out::println);
        System.out.println("===============");
        List<Integer> listt = list.stream().filter(item -> item > 30).collect(Collectors.toList());
        System.out.println(listt);
        System.out.println("Map Example======");
        list.stream().map(item -> item + 5).forEach(System.out::println);
        List<Integer> listtt = list.stream().map(item -> item + 5).filter(item -> item > 80).collect(Collectors.toList());
        System.out.println("listtt:::" + listtt);
        List<Integer> list2 = list.stream().filter(item -> item > 80).map(item -> item + 5).collect(Collectors.toList());
        System.out.println("list22::" + list2);

        Predicate<Integer> condition = item -> item > 80;

        ArrayList<Integer> al = (ArrayList<Integer>) list.stream().filter(condition).collect(Collectors.toList());
        System.out.println(al);


        /*//functional Interfaces
        1.Predicate ->Test() -->boolean
        2.function
            3.Consumer
            4.Supplier
            5.byConsumer
            6.bySupplier*/
        Function<Integer, Integer> addition = item -> item + 5;
        List<Integer> list23 = list.stream().map(addition).collect(Collectors.toList());
        System.out.println("list23:::" + list23);

    }
}
