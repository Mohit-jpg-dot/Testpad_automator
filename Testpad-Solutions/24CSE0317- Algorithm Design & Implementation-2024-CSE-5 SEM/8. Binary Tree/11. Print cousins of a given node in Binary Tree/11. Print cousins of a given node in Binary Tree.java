class Result {
    static void printCousins(Node root, int k) {
        if (root == null || root.data == k) {
            System.out.print(-1);
            return;
        }
        java.util.Queue<Node> queue = new java.util.LinkedList<>();
        queue.add(root);
        boolean found = false;
        StringBuilder sb = new StringBuilder();
        while (!queue.isEmpty() && !found) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                Node curr = queue.poll();
                // Check if current node is the parent of the node with key k
                if ((curr.leftChild != null && curr.leftChild.data == k) || 
                    (curr.rightChild != null && curr.rightChild.data == k)) {
                    found = true; // We found the parent, so the cousins are on the same level next
                    // Do NOT add children of the parent to the queue because cousins cannot be siblings
                } else {
                    // Add children to queue for next level traversal
                    if (curr.leftChild != null) {
                        queue.add(curr.leftChild);
                    }
                    if (curr.rightChild != null) {
                        queue.add(curr.rightChild);
                    }
                }
            }
            // If the parent was found in the previous level, the current queue contains all cousins
            if (found) {
                while (!queue.isEmpty()) {
                    Node cousin = queue.poll();
                    if (sb.length() > 0) {
                        sb.append(" ");
                    }
                    sb.append(cousin.data);
                }
                break;
            }
        }
        if (sb.length() == 0) {
            System.out.print(-1);
        } else {
            System.out.print(sb.toString());
        }
    }
}