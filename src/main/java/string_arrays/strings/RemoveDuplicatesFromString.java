package string_arrays.strings;

import java.util.HashMap;

public class RemoveDuplicatesFromString {

    public static String remove(String input) {
        if(input == null || input.trim().length() == 0){
            throw new IllegalArgumentException("Invalid String");
        }

        int size = input.length();
        HashMap<Character, Integer> LOOKUP = new HashMap<>();

        StringBuffer buffer = new StringBuffer();

        for (int i = 0; i < size; i++) {
            char c = input.charAt(i);
            boolean isCharExists = LOOKUP.containsKey(c);

            if (isCharExists) {
                LOOKUP.put(c, LOOKUP.get(c) + 1);
            } else {
                buffer.append(c);
                LOOKUP.put(c, 1);
            }
        }

        return buffer.toString();
    }

    public static void main(String[] args) {
        System.out.println(remove("tutorialhorizon"));
    }
}
