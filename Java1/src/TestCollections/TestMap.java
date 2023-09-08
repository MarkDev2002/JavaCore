package TestCollections;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {

        //Sử dụng Map

        Map<String, Integer> map = new HashMap<>();

        map.put("a", 10);
        map.put("b", 20);
        map.put("c", 30);

        System.out.println("Kích thước của map : " + map.size());
        System.out.println(map);

        System.out.println("\n");

        if (map.containsKey("a")) {
            int a = map.get("a");
            System.out.println("Value for key" + " \"a\" is : " + a);
        }

        System.out.println("\n");

        for (String key : map.keySet()) {
            System.out.println("Key : " + key + ", value : " + map.get(key));
        }

        System.out.println("\n");

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey() + ", value : " + entry.getValue());
        }
    }
}
