package LearnPackage.Collections;

import java.util.*;
import java.util.Collection;

public class ListHashMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("T-Shirt", 7);
        map.put("Jeans", 5);
        map.put("Gloves", 11);
        System.out.println(map);
        Set<String> set = map.keySet();
        System.out.println(set);
        Collection<Integer> collection = map.values();
        System.out.println(collection);

    }
}
