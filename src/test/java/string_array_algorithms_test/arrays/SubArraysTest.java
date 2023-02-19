package string_array_algorithms_test.arrays;

import org.junit.Test;
import recursion.SubArrayProblems;

public class SubArraysTest {

    @Test
    public void test() {
        SubArrayProblems.printSubArrayWithSum(new int[]{1, 4, 20, 3, 10, 5}, 33);
        SubArrayProblems.printSubArrayWithSum(new int[]{1, 4, 20, 3, 10, 5}, 15);
        SubArrayProblems.printSubArrayWithSum(new int[]{1, 4, 20, 3, 10, 5}, 1);
        SubArrayProblems.printSubArrayWithSum(new int[]{2, 4, 20, 3, 10, 5}, 5);
    }

    @Test
    public void test1() {
        String s = "ashishmjain";
        System.out.println(s.indexOf('i'));
    }


}
