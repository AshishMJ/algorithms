package backtracking;


public class RatMaze {
    private int[][] solMatrix;
    private int[][] inputMatrix;
    private int N;

    public RatMaze(int[][] inputMatrix, int N) {
        this.N = N;
        this.inputMatrix = inputMatrix;
        initializeSolutionMatrix();
    }

    private void initializeSolutionMatrix() {
        solMatrix = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                solMatrix[i][j] = 0;
            }
        }
    }

    private void printSolution() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(solMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private boolean isPosEligible(int i, int j) {
        return (i < N && j < N && inputMatrix[i][j] == 1);
    }

    public boolean solveMaze(int i, int j) {
        boolean isPossible = false;

        if (isPosEligible(i, j)) {
            solMatrix[i][j] = 1;

            if (i == N - 1 && j == N - 1 && inputMatrix[i][j] == 1) {
                isPossible = true;
            } else if (solveMaze(i, j + 1)) {
                isPossible = true;
            } else if (solveMaze(i + 1, j)) {
                isPossible = true;
            }

            if (!isPossible) {
                solMatrix[i][j] = 0;
            }
        }
        return isPossible;
    }


    public static void main(String args[]) {
        int[][] maze = {{1, 1, 1},
                {0, 1, 1},
                {0, 1, 1}
        };
        RatMaze rat = new RatMaze(maze, maze.length);
        boolean isSolved = rat.solveMaze(0, 0);
        if (isSolved) {
            rat.printSolution();
        } else {
            System.out.println("No solution exists for the maze.");
        }
    }
}
