class Result {
    static String inspectStrings(String[] words) {
        if (words == null || words.length == 0) {
            return "";
        }
        HashMap<String, Integer> freqMap = new HashMap<>();
        // Count frequencies of each string
        for (String word : words) {
            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
        }
        String result = "";
        int maxCount = 0;
        // Find the string with the maximum frequency
        // For ties, ensure we pick the alphabetically later string
        for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
            String currWord = entry.getKey();
            int currCount = entry.getValue();
            if (currCount > maxCount) {
                maxCount = currCount;
                result = currWord;
            } else if (currCount == maxCount) {
                // If counts are equal, pick the alphabetically later string
                if (currWord.compareTo(result) > 0) {
                    result = currWord;
                }
            }
        }
        return result;
    }
}