package DP;

import org.junit.Test;

public class RodCuttingTest {

    @Test
    public void test() {
        int[] prices = {2, 3, 7, 8, 9} ;
        RodCuttingProblem rodCuttingProblem = new RodCuttingProblem(prices);
        int maxRevenue = rodCuttingProblem.findMaxRevenue();
        System.out.println(maxRevenue);
    }
}
