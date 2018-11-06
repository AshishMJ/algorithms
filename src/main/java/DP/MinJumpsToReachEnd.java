package DP;

public class MinJumpsToReachEnd {

    /**
     * minJumps(start, end) = MIN(minJumps(K, end)) where K is the number of reachable increments starting from start till end .
     */
    public static int findUsingRecursive(int[] arr, int st, int end) {
        if (st == end) {
            return 0;
        }

        int minJumps = Integer.MAX_VALUE;
        for (int k = st + 1; k <= st + arr[st] && k <= end; k++) {
            int res = findUsingRecursive(arr, k, end);
            if (res != Integer.MAX_VALUE && 1 + res < minJumps) {
                minJumps = 1 + res;
            }
        }

        return minJumps;
    }

    public static int findUsingBottomUp(int[] arr) {
        final int N = arr.length;
        int[] T = new int[N];
        T[N - 1] = 0;

        for (int i = N - 2; i >= 0; i--) {
            int minJumps = Integer.MAX_VALUE;

            for (int j = i + 1; j <= i + arr[i] && j < N; j++) {
                if (1 + T[j] < minJumps) {
                    minJumps = 1 + T[j];
                }
            }

            T[i] = minJumps;
        }

        return T[0];
    }


}
