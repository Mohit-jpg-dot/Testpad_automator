class Result {
    static long power(int base, int exp) {
        // If the exponent is negative, return -1 as per the problem requirements
        if (exp < 0) {
            return -1;
        }
        // Base case: any number to the power of 0 is 1
        if (exp == 0) {
            return 1;
        }
        // Recursive step using divide and conquer for O(log n) time complexity
        long half = power(base, exp / 2);
        if (exp % 2 == 0) {
            return half * half;
        } else {
            return base * half * half;
        }
    }
}