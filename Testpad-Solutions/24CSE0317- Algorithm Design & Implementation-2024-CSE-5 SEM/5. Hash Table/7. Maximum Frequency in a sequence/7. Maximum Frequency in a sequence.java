class Result {
    static int maxFrequency(int A[], int n) {
        // Since constraints state 0 <= A[i] <= 1000, 
        // we can use a frequency array of size 1001.
        int[] freq = new int[1001];
        // Count frequencies of each number
        for (int i = 0; i < n; i++) {
            freq[A[i]]++;
        }
        int maxFreq = 0;
        int bestNum = -1;
        // Find the number with the highest frequency.
        // Iterating from 0 to 1000 ensures that in case of a tie,
        // the smaller number is chosen.
        for (int i = 0; i <= 1000; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                bestNum = i;
            }
        }
        return bestNum;
    }
}