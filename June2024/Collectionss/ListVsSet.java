package June2024.Collectionss;

import java.util.*;

public class ListVsSet {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);
        list.add(10);
        System.out.println(list);

        //set
        Set<Integer> sett = new HashSet<>();
        //HashTable  --> hashcode _
        sett.add(10);
        sett.add(20);
        sett.add(30);
        sett.add(10);
        sett.add(10);
        System.out.println("HashSet::" + sett);


        Set<Integer> linkedSet = new LinkedHashSet<>();
        //HashTable  --> hashcode _
        linkedSet.add(10);
        linkedSet.add(20);
        linkedSet.add(50);
        linkedSet.add(30);
        linkedSet.add(10);
        linkedSet.add(10);
        System.out.println("LinkedHashSet::" + linkedSet);

        Set<Integer> treeSett = new TreeSet<>();
        //HashTable  --> hashcode _
        treeSett.add(10);
        treeSett.add(20);
        treeSett.add(10);
        treeSett.add(50);
        treeSett.add(30);
        treeSett.add(10);
        System.out.println("TreeSet Example:::" + treeSett);

     /*   for(Integer item:treeSett){
            System.out.println(item);
        }*/

        //stream API
        treeSett.stream().forEach(System.out::println);
        System.out.println("=========");
        treeSett.stream().forEach(item -> System.out.println(item));


    }
}
