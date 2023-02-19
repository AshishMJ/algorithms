package string_array_algorithms_test.arrays;

import org.junit.Test;
import string_arrays.arrays.SegregateZeroAndOne;

public class SegregateZeroAndOneTest {

    @Test
    public void test(){
        int[] arr = {0, 1, 0, 1, 0, 1, 0};
        SegregateZeroAndOne.segregate(arr);
        print(arr);

        int[] arr1 = {1,1,1,0,0,0,0,0};
        SegregateZeroAndOne.segregate(arr1);
        print(arr1);

        int[] arr2 = {1,1,1,1,1,1,1,1,0};
        SegregateZeroAndOne.segregate(arr2);
        print(arr2);

        int[] arr3 = {1,1,1,1,0,1,1,1,1};
        SegregateZeroAndOne.segregate(arr3);
        print(arr3);

        int[] arr4 = {0,0,0,0,1,0};
        SegregateZeroAndOne.segregate(arr4);
        print(arr4);
    }

    private void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
