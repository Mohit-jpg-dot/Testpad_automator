class Result {
    static int firstUniqueChar(String str) {
        int[] freq = new int[26];
        int n = str.length();
        // Count the frequency of each character
        for (int i = 0; i < n; i++) {
            freq[str.charAt(i) - 'a']++;
        }
        // Find the first character with a frequency of 1
        for (int i = 0; i < n; i++) {
            if (freq[str.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        // If no non-repeating character exists, return -1
        return -1;
    }
}