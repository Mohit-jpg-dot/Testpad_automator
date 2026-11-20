class Result {
    static int isFoldable(Node root) {
        if (root == null) {
            return 1;
        }
        // Check if the left subtree is a structural mirror of the right subtree
        return isMirror(root.left, root.right) ? 1 : 0;
    }
    private static boolean isMirror(Node node1, Node node2) {
        // If both nodes are null, they match
        if (node1 == null && node2 == null) {
            return true;
        }
        // If one of them is null and the other is not, structure doesn't match
        if (node1 == null || node2 == null) {
            return false;
        }
        // For folding, node1's left must match node2's right, 
        // and node1's right must match node2's left
        return isMirror(node1.left, node2.right) && isMirror(node1.right, node2.left);
    }
}