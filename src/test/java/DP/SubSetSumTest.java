package DP;

import org.junit.Test;

public class SubSetSumTest {

    @Test
    public void testIfSubSetExists() {
        int[] arr = {3, 2, 7, 1};
        int sum = 1;
        System.out.println(SubSetSum.findIfSubSetExistsRecursive(arr, sum, 0,0));
        System.out.println(SubSetSum.findIfExistsUsingDP(arr, sum));
    }
}
