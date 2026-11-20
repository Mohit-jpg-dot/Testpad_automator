import java.util.HashSet;
class Result {
    static int getPairsCount(int arr[], int n, int k) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        // Add all elements to the set
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }
        // Check for each element whether arr[i] + k exists in the set
        for (int i = 0; i < n; i++) {
            if (set.contains(arr[i] + k)) {
                count++;
            }
        }
        return count;
    }
}