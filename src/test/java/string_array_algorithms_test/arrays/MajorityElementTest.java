package string_array_algorithms_test.arrays;

import org.junit.Assert;
import org.junit.Test;
import string_arrays.arrays.MajorityElement;

import java.util.Arrays;

public class MajorityElementTest {
    private final MajorityElement majorityElement = new MajorityElement();

    @Test
    public void test() {
        int[] arr = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        int result = majorityElement.findForUnSortedArray(arr);
        Assert.assertEquals(1, result);
    }

    @Test
    public void test1() {
        int[] arr = {3, 3, 4, 2, 4, 4, 2, 4};
        int result = majorityElement.findForUnSortedArray(arr);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void test3() {
        int[] arr = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        Arrays.sort(arr);
        int result = majorityElement.findForSortedArray(arr);
        System.out.println(result);
    }

    @Test
    public void test4() {
        int[] arr = {3, 3, 4, 2, 4, 4, 2, 4};
        Arrays.sort(arr);
        int result = majorityElement.findForSortedArray(arr);
        System.out.println(result);
    }
}
