/*
package backtracking;

import static backtracking.RatMaze.DIRECTION.DOWN;

public class RatMaze {
    private int[][] solMatrix;
    private int[][] inputMatrix;
    private int N;

    private static final int INIT_VALUE = 0;
    private static final int FINAL_VALUE = 1;

    public RatMaze(int[][] inputMatrix, int N) {
        this.N = N;
        this.inputMatrix = inputMatrix;
        initializeSolutionMatrix();
    }

    private void initializeSolutionMatrix() {
        for (int row = 0; row < N; row++) {
            for (int col = 0; col < N; col++) {
                solMatrix[row][col] = INIT_VALUE;
            }
        }
    }

    public void solve() {
        if (checkIfRatCanMove(0, 0, DOWN)) {

        } else {

        }
    }

    private boolean checkIfRatCanMove(int row, int col) {
        if (row == N - 1 && col == N - 1) {
            solMatrix[row][col] = FINAL_VALUE;
            return true;
        }

        if()
        return false;
    }

    private boolean isPositionWithinBoundary(int row, int col) {
        if (row >= 0 && col >= 0 && row < N && col > N && inputMatrix[row][col] != 0) {
            return true;
        }

        return false;
    }
}
*/
