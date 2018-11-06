package divideAndConquerTest;

import divideAndConquer.sorting.recursive.MergeSortRecursive;
import org.junit.Test;

/**
 * Created by ashishm on 19/3/18.
 */
public class MergeSortRecursiveTest {

    @Test
    public void test() {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        MergeSortRecursive mergeSortRecursive = new MergeSortRecursive(arr);
        mergeSortRecursive.sort(arr, 0, arr.length - 1);
        mergeSortRecursive.printResult();
    }
}
