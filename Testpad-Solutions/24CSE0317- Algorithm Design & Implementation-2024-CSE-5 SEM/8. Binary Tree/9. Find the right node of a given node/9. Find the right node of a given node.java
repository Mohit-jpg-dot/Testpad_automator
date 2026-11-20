class Result {
    static int findRightSibling(Node root, int key) {
        if (root == null) {
            return -1;
        }
        java.util.Queue<Node> queue = new java.util.LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            boolean found = false;
            for (int i = 0; i < levelSize; i++) {
                Node curr = queue.poll();
                // If we previously found the key in this level, the current node is its right sibling
                if (found) {
                    return curr.data;
                }
                // Check if current node matches the key
                if (curr.data == key) {
                    found = true;
                }
                if (curr.left != null) {
                    queue.add(curr.left);
                }
                if (curr.right != null) {
                    queue.add(curr.right);
                }
            }
            // If the key was the last element in this level, it has no right sibling
            if (found) {
                return -1;
            }
        }
        return -1;
    }
}