import java.util.HashMap;
class Result {
    static int largSubArray(int ar[], int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLen = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += ar[i];
            // If the running sum is 0, the subarray starts from index 0
            if (sum == 0) {
                maxLen = i + 1;
            }
            // If the running sum has been seen before, it means the elements 
            // between the previous occurrence index and current index sum to 0
            if (map.containsKey(sum)) {
                int len = i - map.get(sum);
                if (len > maxLen) {
                    maxLen = len;
                }
            } else {
                // Store the first occurrence of this running sum
                map.put(sum, i);
            }
        }
        // If maxLen is still 0, no subarray with 0 sum was found
        return maxLen == 0 ? -1 : maxLen;
    }
}