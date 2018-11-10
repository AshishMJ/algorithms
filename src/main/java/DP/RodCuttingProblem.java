package DP;

public class RodCuttingProblem {

    private int rodLength;
    private int[] prices;

    public RodCuttingProblem(int[] prices) {
        setPrices(prices);
    }

    public void setPrices(int[] prices) {
        this.rodLength = prices.length;
        this.prices = prices;
    }

    public int findMaxRevenue() {
        int[][] solMatrix = new int[rodLength][rodLength + 1];

        for (int i = 0; i <= rodLength; i++) {
            solMatrix[0][i] = i * prices[0];
        }

        for (int i = 1; i < rodLength; i++) {
            for (int j = 1; j <= rodLength; j++) {
                if (j >= i + 1) {
                    solMatrix[i][j] = Math.max(solMatrix[i - 1][j],
                            solMatrix[i][j - (i + 1)] + prices[i]);
                } else {
                    solMatrix[i][j] = solMatrix[i - 1][j];
                }
            }
        }

        return solMatrix[rodLength - 1][rodLength];
    }
}
