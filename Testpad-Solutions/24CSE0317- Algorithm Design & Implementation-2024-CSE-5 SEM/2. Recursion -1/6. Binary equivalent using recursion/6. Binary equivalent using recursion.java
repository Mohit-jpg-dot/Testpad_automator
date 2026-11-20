class Result {
    static int decimalToBinary(int n) {
        // Base case: if n is 0, return 0
        if (n == 0) {
            return 0;
        }
        // Handle negative numbers if required
        if (n < 0) {
            return -decimalToBinary(-n);
        }
        // Recursive step: process n / 2 and append the remainder (n % 2)
        return decimalToBinary(n / 2) * 10 + (n % 2);
    }
}