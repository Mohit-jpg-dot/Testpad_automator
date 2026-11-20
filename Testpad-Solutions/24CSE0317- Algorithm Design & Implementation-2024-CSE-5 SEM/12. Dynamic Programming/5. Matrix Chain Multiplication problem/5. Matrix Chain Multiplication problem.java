class Result {
    // Matrix A[i] has dimension p[i-1] x p[i] for i = 1..n
    static int matrixChainMultiplication(int p[], int n) {
        // n is the number of matrices, so the size of array p is n + 1
        int len = n + 1;
        int[][] dp = new int[len][len];
        // dp[i][i] is zero because cost of multiplying one matrix is 0
        for (int i = 1; i < len; i++) {
            dp[i][i] = 0;
        }
        // L is chain length
        for (int L = 2; L < len; L++) {
            for (int i = 1; i < len - L + 1; i++) {
                int j = i + L - 1;
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i; k <= j - 1; k++) {
                    // cost = cost/scalar multiplications of left sub-chain + 
                    // right sub-chain + multiplication of two resulting matrices
                    int cost = dp[i][k] + dp[k + 1][j] + p[i - 1] * p[k] * p[j];
                    if (cost < dp[i][j]) {
                        dp[i][j] = cost;
                    }
                }
            }
        }
        return dp[1][n];
    }
}