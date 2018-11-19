package core_java;

import java.util.HashMap;

public class HashMapTest {

    public static void main(String[] args) {
        testIntegerWrapperAsKey();
        testStringAsKey();
    }

    private static void testIntegerWrapperAsKey() {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);

        map.put(Integer.valueOf(1), 2);
        map.put(1, 3);

        map.put(2, 2);

        System.out.println(map);
    }

    private static void testStringAsKey() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Ashish", 1);

        map.put(new String("Ashish"), 2);

        map.put("Jain", 2);

        System.out.println(map);
    }
}
