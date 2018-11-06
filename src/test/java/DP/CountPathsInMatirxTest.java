package DP;

import org.junit.Test;

public class CountPathsInMatirxTest {

    @Test
    public void test() {
        System.out.println("For 3X3 matrix : " + CountPathsFromTopToBottomInMatrix.count(3, 3));
        System.out.println("For 4X4 matrix : " + CountPathsFromTopToBottomInMatrix.count(4, 4));

        System.out.println("For 4X2 matrix : " + CountPathsFromTopToBottomInMatrix.count(4, 2));
        System.out.println("For 2X4 matrix : " + CountPathsFromTopToBottomInMatrix.count(2, 4));

        System.out.println("For 1X1 matrix : " + CountPathsFromTopToBottomInMatrix.count(1, 1));
    }
}
