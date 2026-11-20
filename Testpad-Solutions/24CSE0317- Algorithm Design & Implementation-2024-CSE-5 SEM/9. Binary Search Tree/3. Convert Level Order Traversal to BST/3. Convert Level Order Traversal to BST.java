class Result {
    static Node buildSearchTree ( int t [], int n ) {
        if (n == 0 || t == null) {
            return null;
        }
        Node root = null;
        for (int i = 0; i < n; i++) {
            root = insert(root, t[i]);
        }
        return root;
    }
    private static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }
        if (val < root.data) {
            root.leftChild = insert(root.leftChild, val);
        } else if (val > root.data) {
            root.rightChild = insert(root.rightChild, val);
        }
        return root;
    }
}