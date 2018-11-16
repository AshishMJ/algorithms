package divideAndConquerTest;

import divideAndConquer.CountFrequency;
import org.junit.Test;

/**
 * Created by ashishm on 24/3/18.
 */
public class CountFrequencyTest {

    @Test
    public void test(){
        int[] arr = {1, 1, 2, 2, 2, 2, 3};
        int key = 4;

        CountFrequency countFrequency = new CountFrequency(arr);
        countFrequency.count(0, arr.length-1, key);
        System.out.println(countFrequency.returnCount());
    }
}
