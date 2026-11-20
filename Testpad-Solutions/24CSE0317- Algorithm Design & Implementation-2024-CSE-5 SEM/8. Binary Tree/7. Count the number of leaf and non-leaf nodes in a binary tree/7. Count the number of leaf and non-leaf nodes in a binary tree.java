class Result {
    static int countLeafs(Node root) {
        if (root == null) {
            return 0;
        }
        // If a node has no left and right child, it's a leaf node
        if (root.left == null && root.right == null) {
            return 1;
        }
        // Recursively count in left and right subtrees
        return countLeafs(root.left) + countLeafs(root.right);
    }
    static int countNonLeafs(Node root) {
        if (root == null) {
            return 0;
        }
        // If a node has at least one child, it's a non-leaf node
        if (root.left != null || root.right != null) {
            return 1 + countNonLeafs(root.left) + countNonLeafs(root.right);
        }
        // If it's a leaf node, don't count it
        return 0;
    }
}