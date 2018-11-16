package divideAndConquer;

/**
 * Created by ashishm on 19/3/18.
 */
public class QuickSortRecursive {
    private int[] arr;

    public QuickSortRecursive(int[] arr) {
        this.arr = arr;
    }

    public void sort(int[] arr, int low, int high) {
        if (low < high) {
            final int pivot = partition(arr, low, high);
            sort(arr, low, pivot);
            sort(arr, pivot + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int i = low, j = high;
        int pivot = (low + high) / 2;

        while (i < j) {
            while (arr[i] < arr[pivot]) {
                i++;
            }
            while (arr[j] > arr[pivot]) {
                j--;
            }

            if (i < j) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
                j--;
            }
        }

        return pivot;
    }

    public void printResult() {
        if (arr == null) {
            throw new IllegalStateException("Initialize the array.");
        }

        for (int a : arr) {
            System.out.println(a);
        }
    }
}
