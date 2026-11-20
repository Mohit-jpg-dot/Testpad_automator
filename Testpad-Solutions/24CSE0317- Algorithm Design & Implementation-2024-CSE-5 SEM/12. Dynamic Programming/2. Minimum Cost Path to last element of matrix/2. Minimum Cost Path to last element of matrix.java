class Result {
    static int minCostPath(int cost[][], int m, int n) {
        int[][] dp = new int[m][n];
        // Cost of source
        dp[0][0] = cost[0][0];
        // Initialize first row (can only come from left)
        for (int j = 1; j < n; j++) {
            dp[0][j] = dp[0][j - 1] + cost[0][j];
        }
        // Initialize first column (can only come from top)
        for (int i = 1; i < m; i++) {
            dp[i][0] = dp[i - 1][0] + cost[i][0];
        }
        // Construct rest of the dp table using the allowed movements (down, right, diagonally lower)
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = cost[i][j] + Math.min(dp[i - 1][j - 1], 
                                          Math.min(dp[i - 1][j], dp[i][j - 1]));
            }
        }
        return dp[m - 1][n - 1];
    }
}