class Result {
    static int gcd(int i, int j) {
        // Base case: if j is 0, the GCD is i
        if (j == 0) {
            return i;
        }
        // Recursive step: gcd(b, a % b)
        return gcd(j, i % j);
    }
}