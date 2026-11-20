import java.util.ArrayList;
import java.util.Collections;
class Solve {
    /*
     * Return all the permutations of the given string in any order,
     * as they will be sorted at the back-end before printing.
     */
    ArrayList<String> permute(String str) {
        ArrayList<String> result = new ArrayList<>();
        if (str == null || str.length() == 0) {
            return result;
        }
        backtrack(str.toCharArray(), 0, result);
        return result;
    }
    private void backtrack(char[] chars, int index, ArrayList<String> result) {
        if (index == chars.length) {
            result.add(new String(chars));
            return;
        }
        for (int i = index; i < chars.length; i++) {
            swap(chars, index, i);
            backtrack(chars, index + 1, result);
            swap(chars, index, i); // backtrack
        }
    }
    private void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}