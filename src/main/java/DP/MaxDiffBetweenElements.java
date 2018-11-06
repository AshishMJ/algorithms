package DP;

public class MaxDiffBetweenElements {

    public static int maxDiff(int[] arr) {
        int size = arr.length;
        int maxDiff = Integer.MIN_VALUE;

        for (int i = 1; i < size; i++) {
            int maxDiffHere = Integer.MIN_VALUE;

            for (int j = 0; j < i; j++) {
                int diff = arr[i] - arr[j];
                if (diff > 0 && diff > maxDiffHere) {
                    maxDiffHere = diff;
                }
            }

            if (maxDiffHere != Integer.MIN_VALUE && maxDiffHere > maxDiff) {
                maxDiff = maxDiffHere;
            }
        }

        return maxDiff;
    }

    public static int maxDiffOptimized(int[] arr) {
        int size = arr.length;
        int maxDiff = Integer.MIN_VALUE;
        int minElementPosition = 0;

        int largest = 0;
        int smallest = 0;

        for (int i = 1; i < size; i++) {

            int diff = arr[i] - arr[minElementPosition];
            if (diff > 0 && diff > maxDiff) {
                maxDiff = diff;
                largest = i;
                smallest = minElementPosition;
            }

            if (arr[i] < arr[minElementPosition]) {
                minElementPosition = i;
            }
        }

        System.out.println("Larger element is at position : " + largest + " and smaller element is position  : " + smallest);
        return maxDiff;
    }


    public static void main(String[] args) {

        int[] arr = {12, 3, 1, 5, 6, 4, 10, 9, 8, 0};
        //System.out.println(maxDiff(arr));
        System.out.println(maxDiffOptimized(arr));
    }
}
