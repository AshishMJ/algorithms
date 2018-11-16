package divideAndConquer;

/**
 * Created by ashishm on 16/3/18.
 */
public class MergeSortRecursive {
    private int[] arr;

    public MergeSortRecursive(int[] arr) {
        this.arr = arr;
    }

    public void sort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            sort(arr, low, mid);
            sort(arr, mid + 1, high);
            merge(arr, low, high);
        }
    }

    private void merge(int[] arr, int low, int high) {
        int mid = (low + high) / 2;

        int n1 = mid - low + 1;
        int n2 = high - mid;

        int[] l = new int[n1];
        int[] r = new int[n2];

        for (int i = 0; i < n1; i++) {
            l[i] = arr[low + i];
        }

        for (int j = 0; j < n2; j++) {
            r[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = low;
        while (i < n1 && j < n2) {
            if (l[i] < r[j]) {
                arr[k] = l[i];
                i++;
            } else {
                arr[k] = r[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = l[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = r[j];
            j++;
            k++;
        }
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
