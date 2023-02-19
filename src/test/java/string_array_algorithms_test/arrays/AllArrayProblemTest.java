package string_array_algorithms_test.arrays;

import org.junit.Test;
import string_arrays.arrays.AllArrayProblems;

public class AllArrayProblemTest {

    @Test
    public void testMinIncrementsToRemoveDup() {
        int i = AllArrayProblems.minIncrementsToRemoveDup(new int[]{1,1,3,3});
        System.out.println(i);
    }
}
