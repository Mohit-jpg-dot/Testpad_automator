class Result {
    static int subsetSum(int a[], int n, int sum) {
        boolean[][] dp = new boolean[n + 1][sum + 1];
        // If sum is 0, then answer is true (empty subset)
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }
        // If sum is not 0 and set is empty, then answer is false
        for (int j = 1; j <= sum; j++) {
            dp[0][j] = false;
        }
        // Fill the dp table in bottom-up manner
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if (a[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - a[i - 1]];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][sum] ? 1 : 0;
    }
}