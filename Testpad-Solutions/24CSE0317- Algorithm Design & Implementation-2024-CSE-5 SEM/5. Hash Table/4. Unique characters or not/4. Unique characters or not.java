import java.util.HashSet;
class Result {
    // Return true if string contains all unique characters, else return false
    static boolean isUniqueChars(String str) {
        if (str == null) {
            return true;
        }
        HashSet<Character> seen = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            // If character is already in the set, a duplicate exists
            if (seen.contains(c)) {
                return false;
            }
            seen.add(c);
        }
        return true;
    }
}