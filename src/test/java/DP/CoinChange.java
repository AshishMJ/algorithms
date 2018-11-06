package DP;

import org.junit.Test;

public class CoinChange {

    @Test
    public void test() {
        final int[] coins = {1, 2, 3, 4, 5, 6};
        final int sum = 4;

        int DPways = CoinChangeWays.find(coins, sum);
        System.out.println("DP : " + DPways);

        int recusriveWays = CoinChangeWays.findRecursive(coins, sum, coins.length - 1);
        System.out.println("Recursive : " + recusriveWays);
    }
}
