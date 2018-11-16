package divideAndConquer;

/**
 * Created by ashishm on 24/3/18.
 */
public class MaximumElementInFirstIncreasingAndThenDecreasing {
    private int[] arr;

    public MaximumElementInFirstIncreasingAndThenDecreasing(int[] arr) {
        this.arr = arr;
    }

    public int findMax() {
        if (arr.length == 0) {
            throw new IllegalArgumentException();
        }

        if (arr.length == 1) {
            return arr[0];
        }

        for (int i = 0; i < arr.length; i++) {
            if (i == 0 && arr[0] > arr[1]) {
                return arr[0];
            } else if (i == arr.length - 1 && arr[i] > arr[i - 1]) {
                return arr[i];
            } else if (arr[i - 1] > arr[i] && arr[i] > arr[i + 1]) {
                return arr[i];
            }
        }

        return -1;
    }
}
