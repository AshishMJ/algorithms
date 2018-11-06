package DP;

import org.junit.Test;

public class MinJumpsTest {

    @Test
    public void testRecursive() {
        int[] arr = {1, 3, 6, 3, 2, 3, 6, 8, 9, 5};
        final int minJumps = MinJumpsToReachEnd.findUsingRecursive(arr, 0, arr.length - 1);
        System.out.println(minJumps);
    }

    @Test
    public void testDPTopDown() {
        int[] arr = {1, 3, 6, 3, 2, 3, 6, 8, 9, 5};
        final int minJumps = MinJumpsToReachEnd.findUsingBottomUp(arr);
        System.out.println(minJumps);
    }
}
