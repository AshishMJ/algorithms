package string_array_algorithms_test.arrays;

import org.junit.Test;
import string_arrays.arrays.RepeatingElementsProblems;

public class RepeatingElementsProblemsTest {

    @Test
    public void testFind2RepeatingProb() {
        int[] arr = {4, 2, 4, 5, 2, 3, 1};
        RepeatingElementsProblems.find2RepeatingElements(arr);
    }

    @Test
    public void testFind2NonRepeatingProb() {
        int[] arr = {4, 2, 4, 5, 2, 3, 1};
        RepeatingElementsProblems.find2NonRepeatingElements(arr);

        int[] arr1 = {2, 4, 1, 3, 2, 4};
        RepeatingElementsProblems.find2NonRepeatingElements(arr1);
    }

    @Test
    public void testCountFrequency() {
        int[] arr = {4, 2, 4, 5, 2, 3, 1};
        RepeatingElementsProblems.countFrequency(arr);

        int[] arr1 = {2, 4, 1, 3, 2, 4};
        RepeatingElementsProblems.countFrequency(arr1);
    }
}
