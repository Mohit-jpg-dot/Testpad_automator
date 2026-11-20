class Result {
    static double fractionalKnapsack(int val[], int weight[], int n, int capacity) {
        // Create an array of items with their index and value-to-weight ratio
        Item[] items = new Item[n];
        for (int i = 0; i < n; i++) {
            items[i] = new Item(val[i], weight[i]);
        }
        // Sort items by value-to-weight ratio in descending order
        java.util.Arrays.sort(items, (a, b) -> Double.compare(b.ratio, a.ratio));
        double totalValue = 0.0;
        int currentWeight = 0;
        for (int i = 0; i < n; i++) {
            if (currentWeight + items[i].weight <= capacity) {
                // Take the whole item
                currentWeight += items[i].weight;
                totalValue += items[i].val;
            } else {
                // Take the fractional part of the item
                int remainingCapacity = capacity - currentWeight;
                totalValue += items[i].ratio * remainingCapacity;
                break;
            }
        }
        return totalValue;
    }
    // Helper class to store value, weight, and ratio
    static class Item {
        int val, weight;
        double ratio;
        Item(int val, int weight) {
            this.val = val;
            this.weight = weight;
            this.ratio = (double) val / weight;
        }
    }
}