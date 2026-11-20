class Result {
    static int totalWaysToDistance(int d, int k) {
        if (d == 0) {
            return 1;
        }
        int[] dp = new int[d + 1];
        dp[0] = 1;
        for (int i = 1; i <= d; i++) {
            for (int j = 1; j <= k; j++) {
                if (i - j >= 0) {
                    dp[i] += dp[i - j];
                }
            }
        }
        return dp[d];
    }
}