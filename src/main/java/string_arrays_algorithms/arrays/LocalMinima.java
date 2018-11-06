package string_arrays_algorithms.arrays;

public class LocalMinima {

    public static int getIndexOfLocalMinima(int[] arr) { //O(n approach)
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty.");
        }

        if (arr.length == 1 || (arr[0] <= arr[1])) { // Lower boundary case.
            return 0;
        }

        for (int i = 1; i < arr.length; i++) {
            if (i == arr.length - 1 && arr[i - 1] >= arr[i]) { // Upper boundary case.
                return i;
            }

            if (arr[i] <= arr[i + 1] && arr[i - 1] >= arr[i]) { //Normal case.
                return i;
            }
        }

        return -1;
    }


    public static int getLocalMinima(int[] arr) {
        return arr[getIndexOfLocalMinima(arr)];
    }

    //TODO O(logn) approach using divide and conquer approach.
}
