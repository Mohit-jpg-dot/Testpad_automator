class Result {
    // Complete this function to check placing queen at board[row][col] is safe or not by checking current row, left diagonal & right diagonal.
    int isSafe(int board[][], int row, int col, int N) {
        // Check this row on left side
        for (int i = 0; i < col; i++) {
            if (board[row][i] == 1) {
                return 0;
            }
        }
        // Check upper diagonal on left side
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return 0;
            }
        }
        // Check lower diagonal on left side
        for (int i = row, j = col; i < N && j >= 0; i++, j--) {
            if (board[i][j] == 1) {
                return 0;
            }
        }
        return 1;
    }
    // Complete this function to solve the problem and save the answers in sol ArrayList as required.
    boolean solveNQUtil(int board[][], int col, int N, ArrayList<ArrayList<Integer>> sol) {
        // Base case: If all queens are placed, store the solution
        if (col >= N) {
            ArrayList<Integer> currentSolution = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (board[i][j] == 1) {
                        currentSolution.add(j);
                        break;
                    }
                }
            }
            sol.add(currentSolution);
            return true; // Return true so the driver knows at least one solution exists
        }
        boolean res = false;
        // Consider this column and try placing this queen in all rows one by one
        for (int i = 0; i < N; i++) {
            if (isSafe(board, i, col, N) == 1) {
                // Place this queen
                board[i][col] = 1;
                // Recur to place rest of the queens
                res = solveNQUtil(board, col + 1, N, sol) || res;
                // BACKTRACK: Remove queen from board[i][col]
                board[i][col] = 0;
            }
        }
        return res;
    }
}