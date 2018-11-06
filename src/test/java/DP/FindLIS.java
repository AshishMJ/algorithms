package DP;

import org.junit.Test;

public class FindLIS {

    @Test
    public void test() {
        int[] arr = {3, 10, 2, 1, 20};
        final int lis = LIS.findLIS(arr);
        System.out.println(lis);

        int[] arr1 = {10,22,9,33,21,50,41,60,80};
        System.out.println(LIS.findLIS(arr1));
    }
}
