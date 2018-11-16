package string_array_algorithms_test.arrays;

import org.junit.Assert;
import org.junit.Test;
import string_arrays.arrays.LocalMinima;

public class LocalMinimaTest {

    @Test
    public void testWithValidArray() {
        int[] arr1 = {9, 6, 3, 14, 5, 7, 4};
        int[] arr2 = {23, 8, 15, 2, 3};
        int[] arr3 = {1, 2, 3};
        int[] arr4 = {3, 2, 1};

        Assert.assertEquals(2, LocalMinima.getIndexOfLocalMinima(arr1));
        System.out.println(LocalMinima.getLocalMinima(arr1));
        Assert.assertEquals(1, LocalMinima.getIndexOfLocalMinima(arr2));
        System.out.println(LocalMinima.getLocalMinima(arr2));
        Assert.assertEquals(0, LocalMinima.getIndexOfLocalMinima(arr3));
        System.out.println(LocalMinima.getLocalMinima(arr3));
        Assert.assertEquals(2, LocalMinima.getIndexOfLocalMinima(arr4));
        System.out.println(LocalMinima.getLocalMinima(arr4));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithNullArray() {
        int[] arr = null;
        LocalMinima.getIndexOfLocalMinima(arr);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithEmptyArray() {
        int[] arr = {};
        LocalMinima.getIndexOfLocalMinima(arr);
    }
}
