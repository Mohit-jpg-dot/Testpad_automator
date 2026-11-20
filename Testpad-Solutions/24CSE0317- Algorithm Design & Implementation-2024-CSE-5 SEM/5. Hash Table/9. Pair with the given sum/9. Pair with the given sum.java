class Result {
    // Return true if a pair with the sum k is found, else return false
    static boolean pairSum(int arr[], int n, int k) {
        int left = 0;
        int right = n - 1;
        // Since the array is sorted, we can use the two-pointer approach
        while (left < right) {
            long sum = (long) arr[left] + arr[right]; // Use long to prevent integer overflow
            if (sum == k) {
                return true;
            } else if (sum < k) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }
}