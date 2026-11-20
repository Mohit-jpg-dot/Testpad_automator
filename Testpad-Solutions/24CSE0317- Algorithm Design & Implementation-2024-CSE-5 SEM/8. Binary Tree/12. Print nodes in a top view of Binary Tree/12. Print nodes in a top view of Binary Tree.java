class Result {
    static void printTopView(Node root) {
        if (root == null) {
            return;
        }
        // Map to store the top view nodes for each horizontal distance
        java.util.TreeMap<Integer, Integer> topViewMap = new java.util.TreeMap<>();
        // Queue for Level Order Traversal, holding pairs of (Node, horizontal_distance)
        java.util.Queue<Pair> queue = new java.util.LinkedList<>();
        queue.add(new Pair(root, 0));
        while (!queue.isEmpty()) {
            Pair curr = queue.poll();
            Node node = curr.node;
            int hd = curr.hd;
            // If horizontal distance is not seen yet, add it to the map
            if (!topViewMap.containsKey(hd)) {
                topViewMap.put(hd, node.data);
            }
            // Process left child with hd - 1
            if (node.left != null) {
                queue.add(new Pair(node.left, hd - 1));
            }
            // Process right child with hd + 1
            if (node.right != null) {
                queue.add(new Pair(node.right, hd + 1));
            }
        }
        // Print the values from the map sorted by horizontal distance
        StringBuilder sb = new StringBuilder();
        for (int value : topViewMap.values()) {
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(value);
        }
        System.out.print(sb.toString());
    }
    // Helper class to store Node and its horizontal distance
    static class Pair {
        Node node;
        int hd;
        Pair(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }
}