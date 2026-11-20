class Result {
    static int isBinarySearchTree ( Node root ) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE) ? 1 : 0;
    }
    private static boolean isValidBST(Node node, long minVal, long maxVal) {
        // Base case: an empty tree is a valid BST
        if (node == null) {
            return true;
        }
        // The current node's data must be strictly between minVal and maxVal
        if (node.data <= minVal || node.data >= maxVal) {
            return false;
        }
        // Recursively validate left and right subtrees with updated ranges
        return isValidBST(node.left, minVal, node.data) && 
               isValidBST(node.right, node.data, maxVal);
    }
}