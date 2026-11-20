import java.util.HashMap;
class Result {
    static int kthDistinctElement(int arr[], int N, int K) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        // Count frequencies of each element
        for (int i = 0; i < N; i++) {
            freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0) + 1);
        }
        int distinctCount = 0;
        // Traverse the array to maintain the original order from left to right
        for (int i = 0; i < N; i++) {
            // Check if the element appears only once in the array
            if (freqMap.get(arr[i]) == 1) {
                distinctCount++;
                if (distinctCount == K) {
                    return arr[i];
                }
            }
        }
        // If fewer than K distinct elements exist, return 0
        return 0;
    }
}