package string_array_algorithms_test.strings;

import org.junit.Test;
import string_arrays.strings.PalindromeProblems;

public class PalindromeProblemsTest {

    @Test
    public void test(){
        int len = PalindromeProblems.getMaxLengthPalindromicSubstring("aababbaa");
        System.out.println(len);
    }
}
