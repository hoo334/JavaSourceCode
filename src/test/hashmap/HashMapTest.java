package test.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();

        map.put("hello",0.1);
        System.out.println(map.get("hello"));

    }
}
