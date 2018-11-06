package concerto_test;

import concerto.ConvertNumberIntoWords;
import org.junit.Test;

import java.util.stream.IntStream;

public class ConvertNumberIntoWordsTest {

    @Test
    public void testSingleDigit() {
        System.out.println(ConvertNumberIntoWords.convert(0));
        System.out.println(ConvertNumberIntoWords.convert(1));
    }

    @Test
    public void test2Digits() {
        IntStream.rangeClosed(10, 99).forEach(i -> System.out.println( i + " ->" + ConvertNumberIntoWords.convert(i)));
    }

    @Test
    public void test3Digits() {
        IntStream.rangeClosed(100, 999).forEach(i -> System.out.println( i + " ->" + ConvertNumberIntoWords.convert(i)));
    }

    @Test
    public void test4Digits() {
        IntStream.rangeClosed(1000, 9999).forEach(i -> System.out.println( i + " -> " + ConvertNumberIntoWords.convert(i)));
    }

    @Test
    public void test5Digits() {
        IntStream.rangeClosed(10000, 10000).forEach(i -> System.out.println( i + " -> " + ConvertNumberIntoWords.convert(i)));
    }
}
