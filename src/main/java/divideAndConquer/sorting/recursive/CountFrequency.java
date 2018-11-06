package divideAndConquer.sorting.recursive;

/**
 * Created by ashishm on 24/3/18.
 */
public class CountFrequency {
    private int[] arr;
    private int count;

    public CountFrequency(int[] arr) {
        this.arr = arr;
    }

    public void count(int low, int high, int key) {
        if (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                incrementCount();
            }

            count(low, mid - 1, key);
            count(mid + 1, high, key);
        }
    }

    private void incrementCount() {
        count++;
    }

    public int returnCount() {
        return count;
    }
}
