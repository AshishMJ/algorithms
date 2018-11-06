package DP;

public class LIS {

    public static int findLIS(int[] arr) {
        int L[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            L[i] = 1;
        }

        for (int i = 0; i < arr.length; i++) {
            int max = Integer.MIN_VALUE;

            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i] && L[j] > max) {
                    max = L[j];
                }
            }

            if (max != Integer.MIN_VALUE) {
                L[i] = 1 + max;
            }

        }

        int LIS = L[0];
        for (int i = 1; i < L.length; i++) {
            if (L[i] > LIS) {
                LIS = L[i];
            }
        }

        return LIS;
    }
}
