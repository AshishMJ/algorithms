package string_array_algorithms_test.strings;

import org.junit.Test;
import string_arrays.strings.FindAllPremutations;

public class FindAllPermutationsTest {

    @Test
    public void test(){
        FindAllPremutations.permute("ABC".toCharArray(), 0, 3);
    }
}
