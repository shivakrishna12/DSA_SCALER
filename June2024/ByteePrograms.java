package June2024;

import java.util.LinkedHashMap;
import java.util.Map;

public class ByteePrograms {
    public static void main(String[] args) {
        String name = "shivahiv";

        LinkedHashMap<Character, Integer> lhm = new LinkedHashMap();
        for (int i = 0; i < name.length(); i++) {
            lhm.put(name.charAt(i), lhm.getOrDefault(name.charAt(i), 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : lhm.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
                return;
            }
        }
    }

}
