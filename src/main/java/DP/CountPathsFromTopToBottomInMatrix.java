package DP;

public class CountPathsFromTopToBottomInMatrix {

    public static int count(int rowLength, int colLength) {
        int[][] solMatrix = new int[rowLength][colLength];

        for (int i = 0; i < colLength; i++) {
            solMatrix[rowLength - 1][i] = 1;
        }

        for (int i = 0; i < rowLength; i++) {
            solMatrix[i][colLength - 1] = 1;
        }

        for (int i = rowLength - 2; i >= 0; i--) {
            for (int j = colLength - 2; j >= 0; j--) {
                solMatrix[i][j] = solMatrix[i + 1][j] + solMatrix[i][j + 1];
            }
        }

        return solMatrix[0][0];
    }
}
