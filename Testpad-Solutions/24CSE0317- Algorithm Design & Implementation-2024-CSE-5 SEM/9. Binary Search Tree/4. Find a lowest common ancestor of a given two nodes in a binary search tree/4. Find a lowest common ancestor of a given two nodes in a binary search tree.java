class Result {
    static int lowestCommonAncestor ( Node root , int k1 , int k2 ) {
        // If the tree is empty, return -1 as specified
        if (root == null) {
            return -1;
        }
        Node curr = root;
        while (curr != null) {
            // If both keys are smaller than current node, LCA lies in the left subtree
            if (k1 < curr.data && k2 < curr.data) {
                curr = curr.left;
            }
            // If both keys are greater than current node, LCA lies in the right subtree
            else if (k1 > curr.data && k2 > curr.data) {
                curr = curr.right;
            }
            // Otherwise, current node is the split point, which is the Lowest Common Ancestor
            else {
                return curr.data;
            }
        }
        return -1;
    }
}