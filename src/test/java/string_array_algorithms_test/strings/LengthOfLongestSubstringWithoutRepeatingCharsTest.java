package string_array_algorithms_test.strings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import string_arrays_algorithms.strings.LengthOfLongestSubstringWithoutRepeatingChars;
import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstringWithoutRepeatingCharsTest {

    private Map<String, Integer> testCases;

    @Before
    public void initTestCases() {
        testCases = new HashMap<>() {{
            put(null, 0);
            put("abcabcbb", 3);
            put("bbbbb", 1);
            put("pwwkew", 3);
            put("", 0);
        }};

    }

    @Test
    public void testNaiveMethod() {

        testCases.forEach((string, expectedLength) -> {
            Integer lengthOfLongestSubstring = LengthOfLongestSubstringWithoutRepeatingChars.findLengthUsingNaive(string);
            Assert.assertEquals(expectedLength, lengthOfLongestSubstring);
        });

    }

    @Test
    public void testOptimizedMethod() {

        testCases.forEach((string, expectedLength) -> {
            Integer lengthOfLongestSubstring = LengthOfLongestSubstringWithoutRepeatingChars.lengthOfLongestSubstring(string);
            Assert.assertEquals(expectedLength, lengthOfLongestSubstring);
        });

    }

}
