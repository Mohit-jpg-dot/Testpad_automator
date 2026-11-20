import java.util.LinkedHashMap;
import java.util.Map;
class Result {
    static void countFrequency(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        // Use LinkedHashMap to maintain the order of occurrence
        LinkedHashMap<Character, Integer> freqMap = new LinkedHashMap<>();
        // Count frequencies
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        // Print character and its frequency in order
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            sb.append(entry.getKey()).append(entry.getValue()).append(" ");
        }
        // Print the final result string (with trailing space or trimmed if needed)
        System.out.print(sb.toString().trim());
    }
}