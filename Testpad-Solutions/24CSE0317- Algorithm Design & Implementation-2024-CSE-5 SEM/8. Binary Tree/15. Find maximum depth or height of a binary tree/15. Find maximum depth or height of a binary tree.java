class Result {
    static int treeHeight(Node root) {
        // If tree is empty, height is considered as -1
        if (root == null) {
            return -1;
        }
        // If tree has only one node, height is considered as 0
        if (root.left == null && root.right == null) {
            return 0;
        }
        // Recursively find the height of left and right subtrees
        int leftHeight = treeHeight(root.left);
        int rightHeight = treeHeight(root.right);
        // Height is 1 plus the maximum of left and right heights
        return 1 + Math.max(leftHeight, rightHeight);
    }
}