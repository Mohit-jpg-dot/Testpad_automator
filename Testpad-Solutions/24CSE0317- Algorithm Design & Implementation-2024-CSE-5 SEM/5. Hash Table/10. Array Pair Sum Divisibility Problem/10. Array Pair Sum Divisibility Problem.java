import java.util.HashMap;
class Result {
    static int isArrayDivisibleInPairs(int a[], int n, int k) {
        // If n is odd, we cannot divide the array into pairs
        if (n % 2 != 0) {
            return 0;
        }
        HashMap<Integer, Integer> remainderCount = new HashMap<>();
        // Count frequencies of all remainders
        for (int i = 0; i < n; i++) {
            int rem = ((a[i] % k) + k) % k;
            remainderCount.put(rem, remainderCount.getOrDefault(rem, 0) + 1);
        }
        // Check conditions for each remainder
        for (int i = 0; i < n; i++) {
            int rem = ((a[i] % k) + k) % k;
            // If remainder is 0, the count of numbers with remainder 0 must be even
            if (rem == 0) {
                if (remainderCount.get(rem) % 2 != 0) {
                    return 0;
                }
            } 
            // If remainder is k/2, the count must be even
            else if (2 * rem == k) {
                if (remainderCount.get(rem) % 2 != 0) {
                    return 0;
                }
            } 
            // For any other remainder r, count of r must equal count of k - r
            else {
                int countRem = remainderCount.getOrDefault(rem, 0);
                int countKMinusRem = remainderCount.getOrDefault(k - rem, 0);
                if (countRem != countKMinusRem) {
                    return 0;
                }
            }
        }
        return 1;
    }
}