package string_arrays.strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromString {

    public static String removeDuplicatesFromString(String s) {
        char[] c = s.toCharArray();
        int index = 0;
        Set<Character> LOOKUP = new HashSet<>();

        for (int i = 0; i < c.length; i++) {
            if (LOOKUP.add(c[i])) {
                c[index++] = c[i];
            }
        }

        return String.valueOf(Arrays.copyOf(c, index));
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicatesFromString("Ashish M Jain"));
    }
}
