package DP;

public class CoinChangeWays {

    /**
     * Refer -> https://github.com/mission-peace/interview/blob/master/src/com/interview/dynamic/CoinChanging.java
     *
     */

    public static int find(int[] coins, int sum) {
        int[] R = new int[sum + 1];

        R[0] = 1;

        for (int i = 0; i < coins.length; i++) {
            for (int j = 1; j <= sum; j++) {
                if (j >= coins[i]) {
                    R[j] += R[j - coins[i]]; //Include current coin and find for remaining amount.
                }
            }
        }

        return R[sum];
    }

    /**
     *
     * numberOfWays(c[0...m],Sum) = numberOfWays(0...m, Sum-c[m]) + numberOfWays(0.....m-1, Sum)
     */
    public static int findRecursive(int[] arr, int sum, int N) {
        if (sum == 0) {
            return 1;
        }

        if (sum < 0) {
            return 0;
        }

        if (N < 0) {
            return 0;
        }

        return findRecursive(arr, sum, N - 1) + findRecursive(arr, sum - arr[N], N);
    }
}
