class Result {
    static int postIndex;
    static java.util.HashMap<Integer, Integer> inMap;
    static Node buildTree(int in[], int post[], int N) {
        postIndex = N - 1;
        inMap = new java.util.HashMap<>();
        // Store indexes of inorder elements for O(1) lookup
        for (int i = 0; i < N; i++) {
            inMap.put(in[i], i);
        }
        return buildTreeHelper(in, post, 0, N - 1);
    }
    private static Node buildTreeHelper(int in[], int post[], int inorderStart, int inorderEnd) {
        if (inorderStart > inorderEnd || postIndex < 0) {
            return null;
        }
        // The current root from postorder traversal
        int currentVal = post[postIndex--];
        Node node = new Node(currentVal);
        // If this node has no children, return it
        if (inorderStart == inorderEnd) {
            return node;
        }
        // Get the index of this node in inorder traversal
        int inorderIndex = inMap.get(currentVal);
        // Build right subtree first because we are decrementing postIndex backwards
        node.rightChild = buildTreeHelper(in, post, inorderIndex + 1, inorderEnd);
        node.leftChild = buildTreeHelper(in, post, inorderStart, inorderIndex - 1);
        return node;
    }
}