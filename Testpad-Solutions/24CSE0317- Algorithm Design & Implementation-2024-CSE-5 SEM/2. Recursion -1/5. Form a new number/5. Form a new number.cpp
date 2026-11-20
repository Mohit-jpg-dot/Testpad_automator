int evenDigits(int n) {
    // Base case: if n is 0, return 0
    if (n == 0) {
        return 0;
    }
    // Handle negative numbers if necessary
    if (n < 0) {
        return -evenDigits(-n);
    }
    int lastDigit = n % 10;
    int remaining = evenDigits(n / 10);
    // If the last digit is even, append it to the result from the remaining digits
    if (lastDigit % 2 == 0) {
        // Find the place value to append the digit correctly
        int temp = remaining;
        int multiplier = 1;
        if (temp == 0) {
            return lastDigit;
        }
        while (temp > 0) {
            multiplier *= 10;
            temp /= 10;
        }
        return remaining * 10 + lastDigit;
    } else {
        // If the last digit is odd, ignore it and return the remaining even digits
        return remaining;
    }
}