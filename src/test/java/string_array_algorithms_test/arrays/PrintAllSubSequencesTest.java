package string_array_algorithms_test.arrays;

import org.junit.Test;
import string_arrays.strings.SubSequences;

/**
 * Created by ashishm on 14/5/18.
 */
public class PrintAllSubSequencesTest {

    @Test
    public void test(){
        int[] arr = {1,2,3,4};
        SubSequences subSequences = new SubSequences(arr);
        subSequences.printAllSubsequences();
    }
}
