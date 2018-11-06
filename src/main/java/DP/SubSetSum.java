package DP;

public class SubSetSum {
    /**
     * SubSet(arr[], Sum, N) = SubSet(arr[], Sum-arr[N], N) || Subset(arr[], Sum, N-1);
     */

    public static boolean findIfSubSetExistsRecursive(int[] arr, int sum, int currSum, int idx) {
        if (currSum == sum) {
            return true;
        } else if (idx == arr.length) {
            return false;
        } else {
            boolean ifIncluded = findIfSubSetExistsRecursive(arr, sum, currSum + arr[idx], idx + 1);
            boolean ifExcluded = findIfSubSetExistsRecursive(arr, sum, currSum, idx + 1);
            return ifIncluded || ifExcluded;
        }
    }

    public static boolean findIfExistsUsingDP(int[] arr, int sum) {
        boolean[][] solMatrix = new boolean[arr.length + 1][sum + 1];

        for (int row = 0; row <= arr.length; row++) {
            solMatrix[row][0] = true;
        }

        for (int row = 1; row <= arr.length; row++) {
            for (int col = 1; col <= sum; col++) {
                if (col >= arr[row - 1]) {
                    solMatrix[row][col] = solMatrix[row - 1][col] || solMatrix[row - 1][col - arr[row - 1]];
                } else {
                    solMatrix[row][col] = solMatrix[row - 1][col];
                }
            }
        }

        return solMatrix[arr.length][sum];
    }
}