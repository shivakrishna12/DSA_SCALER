package HashMaps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class BasicMethodInHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("thirupathi", 99);
        hm.put("Sreeja", 98);
        hm.put("Shiva", 90);
        hm.put("Navya", 100);
        hm.put("Srithi", 89);
        hm.put("Arjun", 85);

        //Size of the Map
        System.out.println("Size of the Map::" + hm.size());

        //Key Set
        Set<String> keySett = hm.keySet();
        for (String key : keySett) {
            System.out.println(key + "====" + hm.get(key));
        }

        //containsKey()
        boolean isKeyAvailable = hm.containsKey("shiva");
        System.out.println("isKeyAvailable::" + isKeyAvailable);

        //containsValue()
        boolean isValueAvailable = hm.containsValue(89);
        System.out.println("isValueAvailable::" + isValueAvailable);

        //loop the Map
        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + "===" + entry.getValue());
        }

        //getOrDefault
        System.out.println("getOrDefault :: " + hm.getOrDefault("shiva", 0));

        System.out.println("IS Map Empty::" + hm.isEmpty());
    }
}
