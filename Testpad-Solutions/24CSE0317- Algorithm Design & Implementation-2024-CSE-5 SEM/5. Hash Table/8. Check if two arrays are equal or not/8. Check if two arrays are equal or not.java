import java.util.HashMap;
class Result {
    static int arraysEqualorNot(int[] A, int[] B) {
        // If lengths are different, they cannot be equal
        if (A.length != B.length) {
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        // Count frequencies of each element in array A
        for (int num : A) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // Subtract frequencies using elements from array B
        for (int num : B) {
            // If the element doesn't exist in map or its count is already 0, arrays are not equal
            if (!map.containsKey(num) || map.get(num) == 0) {
                return 0;
            }
            map.put(num, map.get(num) - 1);
        }
        return 1;
    }
}