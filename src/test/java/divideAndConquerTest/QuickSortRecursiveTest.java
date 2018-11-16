package divideAndConquerTest;

import divideAndConquer.QuickSortRecursive;
import org.junit.Test;

/**
 * Created by ashishm on 19/3/18.
 */
public class QuickSortRecursiveTest {

    @Test
    public void test() {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        QuickSortRecursive quickSortRecursive = new QuickSortRecursive(arr);
        quickSortRecursive.sort(arr, 0, arr.length - 1);
        quickSortRecursive.printResult();
    }
}
