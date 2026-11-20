class Result {
    static int countIslands(int mat[][], int m, int n) {
        if (mat == null || m == 0 || n == 0) {
            return 0;
        }
        int islands = 0;
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // If the cell is land ('1') and has not been visited yet, 
                // it belongs to a new island
                if (mat[i][j] == 1 && !visited[i][j]) {
                    dfs(mat, i, j, m, n, visited);
                    islands++;
                }
            }
        }
        return islands;
    }
    private static void dfs(int[][] mat, int r, int c, int m, int n, boolean[][] visited) {
        // Check boundaries and whether the cell is water ('0') or already visited
        if (r < 0 || r >= m || c < 0 || c >= n || mat[r][c] == 0 || visited[r][c]) {
            return;
        }
        // Mark the current land cell as visited
        visited[r][c] = true;
        // Traverse all 4 connected directions (Up, Down, Left, Right)
        dfs(mat, r - 1, c, m, n, visited);
        dfs(mat, r + 1, c, m, n, visited);
        dfs(mat, r, c - 1, m, n, visited);
        dfs(mat, r, c + 1, m, n, visited);
    }
}