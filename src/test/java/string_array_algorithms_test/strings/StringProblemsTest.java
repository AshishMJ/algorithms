package string_array_algorithms_test.strings;

import org.junit.Test;
import string_arrays.strings.StringProblems;

public class StringProblemsTest {

    @Test
    public void testRotation() {
        String s1 = "ABCD", s2 = "BCDA";
        boolean rotation = StringProblems.isRotation(s1, s2);
        System.out.println(rotation);
    }
}
