import java.util.PriorityQueue;
class Result {
    static int connectCost(int lengths[], int n) {
        // If there is 1 or 0 sticks, no cost is needed
        if (n <= 1) {
            return 0;
        }
        // Create a Min-Heap to store stick lengths
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        // Add all stick lengths to the min-heap
        for (int i = 0; i < n; i++) {
            minHeap.add(lengths[i]);
        }
        int totalCost = 0;
        // Combine the two smallest sticks until only one remains
        while (minHeap.size() > 1) {
            int first = minHeap.poll();
            int second = minHeap.poll();
            int cost = first + second;
            totalCost += cost;
            // Push the newly combined stick back into the min-heap
            minHeap.add(cost);
        }
        return totalCost;
    }
}