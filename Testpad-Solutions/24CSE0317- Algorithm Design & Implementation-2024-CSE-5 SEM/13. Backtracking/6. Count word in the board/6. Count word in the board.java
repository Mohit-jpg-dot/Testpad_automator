class Result {
    static int countWord(char board[][], String word, int m, int n) {
        int[] totalCount = {0};
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0)) {
                    dfs(board, word, i, j, 0, visited, m, n, totalCount);
                }
            }
        }
        return totalCount[0];
    }
    private static void dfs(char[][] board, String word, int r, int c, int index, boolean[][] visited, int m, int n, int[] totalCount) {
        // 1. Check boundaries, character match, and whether the cell is already visited FIRST
        if (r < 0 || r >= m || c < 0 || c >= n || visited[r][c] || board[r][c] != word.charAt(index)) {
            return;
        }
        // 2. If we have matched all characters up to the last index of the word
        if (index == word.length() - 1) {
            totalCount[0]++;
            return;
        }
        // Mark the current cell as visited
        visited[r][c] = true;
        // Explore all 4 possible adjacent directions (Up, Down, Left, Right)
        int[] rowNum = {-1, 1, 0, 0};
        int[] colNum = {0, 0, -1, 1};
        for (int i = 0; i < 4; i++) {
            dfs(board, word, r + rowNum[i], c + colNum[i], index + 1, visited, m, n, totalCount);
        }
        // Backtrack: unmark the current cell so it can be used in other paths
        visited[r][c] = false;
    }
}