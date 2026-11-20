class Result {
    static int N = 9;
    static int solveSudoku(int mat[][]) {
        if (solve(mat)) {
            return 1;
        }
        return -1;
    }
    private static boolean solve(int[][] mat) {
        int row = -1;
        int col = -1;
        boolean isEmpty = true;
        // Find an unassigned cell
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (mat[i][j] == 0) {
                    row = i;
                    col = j;
                    isEmpty = false;
                    break;
                }
            }
            if (!isEmpty) {
                break;
            }
        }
        // No empty space left, Sudoku is solved
        if (isEmpty) {
            return true;
        }
        // Try digits from 1 to 9
        for (int num = 1; num <= 9; num++) {
            if (isSafe(mat, row, col, num)) {
                mat[row][col] = num;
                if (solve(mat)) {
                    return true;
                }
                // Backtrack
                mat[row][col] = 0;
            }
        }
        return false;
    }
    private static boolean isSafe(int[][] mat, int row, int col, int num) {
        // Check if 'num' is already in the current row
        for (int d = 0; d < N; d++) {
            if (mat[row][d] == num) {
                return false;
            }
        }
        // Check if 'num' is already in the current column
        for (int r = 0; r < N; r++) {
            if (mat[r][col] == num) {
                return false;
            }
        }
        // Check if 'num' is already in the 3x3 sub-grid
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int r = 0; r < 3; r++) {
            for (int d = 0; d < 3; d++) {
                if (mat[r + startRow][d + startCol] == num) {
                    return false;
                }
            }
        }
        return true;
    }
}