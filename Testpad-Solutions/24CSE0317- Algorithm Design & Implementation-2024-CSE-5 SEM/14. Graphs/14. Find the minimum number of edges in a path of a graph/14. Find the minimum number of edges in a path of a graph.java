class Result {
    static int number_of_edges (int n) {
        if (n <= 1) {
            return 0;
        }
        int[] dp = new int[n + 1];
        java.util.Arrays.fill(dp, Integer.MAX_VALUE);
        dp[1] = 0;
        for (int i = 1; i <= n; i++) {
            if (dp[i] == Integer.MAX_VALUE) continue;
            // Move to i + 1
            if (i + 1 <= n) {
                dp[i + 1] = Math.min(dp[i + 1], dp[i] + 1);
            }
            // Move to 3 * i
            if (3 * i <= n) {
                dp[3 * i] = Math.min(dp[3 * i], dp[i] + 1);
            }
        }
        return dp[n];
    }
}