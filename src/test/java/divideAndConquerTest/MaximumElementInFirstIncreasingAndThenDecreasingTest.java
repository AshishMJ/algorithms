package divideAndConquerTest;

import divideAndConquer.sorting.recursive.MaximumElementInFirstIncreasingAndThenDecreasing;
import org.junit.Test;

/**
 * Created by ashishm on 24/3/18.
 */
public class MaximumElementInFirstIncreasingAndThenDecreasingTest {

    @Test
    public void test() {
        int[] arr = {8, 10, 20, 80, 100, 200, 400, 500, 3, 2, 1};
        MaximumElementInFirstIncreasingAndThenDecreasing maximumElementInFirstIncreasingAndThenDecreasing = new MaximumElementInFirstIncreasingAndThenDecreasing(arr);
        System.out.println(maximumElementInFirstIncreasingAndThenDecreasing.findMax());
    }
}
