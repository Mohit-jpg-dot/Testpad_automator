int sumOfDigits(int n) {
    // Base case: if n is 0, the sum of digits is 0
    if (n == 0) {
        return 0;
    }
    // If the number is negative, return the negation of the sum of its absolute value
    if (n < 0) {
        return -sumOfDigits(-n);
    }
    // Recursive case: last digit + sum of remaining digits
    return (n % 10) + sumOfDigits(n / 10);
}