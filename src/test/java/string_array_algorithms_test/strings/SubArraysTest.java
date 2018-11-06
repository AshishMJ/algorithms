package string_array_algorithms_test.strings;

import org.junit.Test;
import string_arrays_algorithms.strings.SubArrays;

/**
 * Created by ashishm on 14/5/18.
 */
public class SubArraysTest {

    @Test
    public void test() {
        int[] arr = {1, 2, 3};
        SubArrays subArrays = new SubArrays(arr);
        //subArrays.printAllSubArrays();
        //System.out.println(subArrays.getCountOfAllSubArraysLessThanK(100));
        System.out.println(subArrays.getSumOfAllSubArrays());
    }
}
