import java.util.Scanner;
// Do NOT change the class name
class Main {
    // Helper function to find prime factors recursively
    public static void printPrimeFactors(int n, int divisor) {
        // Base case: if n becomes 1, we are done
        if (n <= 1) {
            return;
        }
        // If divisor divides n, print it and recursively call with n / divisor
        if (n % divisor == 0) {
            System.out.println(divisor);
            printPrimeFactors(n / divisor, divisor);
        } else {
            // Otherwise, increment the divisor to check the next number
            printPrimeFactors(n, divisor + 1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            // Start checking for factors starting from 2
            printPrimeFactors(n, 2);
        }
        scanner.close();
    }
}