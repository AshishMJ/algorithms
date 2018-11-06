package backtracking;

public class NQueensProblem {

    private int[][] solutionMatrix;
    private int N;

    private static final int INIT_VALUE = 0;
    private static final int FINAL_VALUE = 1;

    public NQueensProblem(int N) {
        this.N = N;
        solutionMatrix = new int[N][N];
        initializeSolutionMatrix();
    }

    private void initializeSolutionMatrix() {
        for (int row = 0; row < N; row++) {
            for (int col = 0; col < N; col++) {
                solutionMatrix[row][col] = INIT_VALUE;
            }
        }
    }

    public void solve() {
        if (placeQueens(0)) {
            for (int row = 0; row < N; row++) {
                for (int col = 0; col < N; col++) {
                    System.out.print(solutionMatrix[row][col] + "\t");
                }
                System.out.println();
            }
        } else {
            System.out.println("No");
        }
    }

    private boolean placeQueens(int queen) {
        if (queen == N) {
            return true;
        }

        for (int row = 0; row < N; row++) {
            if (canQueenBePlaced(row, queen)) {
                solutionMatrix[row][queen] = FINAL_VALUE;

                if (placeQueens(queen + 1)) {
                    return true;
                }

                solutionMatrix[row][queen] = 0;
            }
        }

        return false;
    }

    private boolean canQueenBePlaced(int row, int column) {
        //Horizontal check.
        for (int i = 0; i <= column; i++) {
            if (solutionMatrix[row][i] == FINAL_VALUE) {
                return false;
            }
        }

        //Upper diagonal.
        for (int i = row, j = column; i >= 0 && j >= 0; i--, j--) {
            if (solutionMatrix[i][j] == FINAL_VALUE) {
                return false;
            }
        }

        //Lower diagonal.
        for (int i = row, j = column; i < N && j >= 0; i++, j--) {
            if (solutionMatrix[i][j] == FINAL_VALUE) {
                return false;
            }
        }
        return true;
    }
}
