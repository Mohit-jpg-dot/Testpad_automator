static Node findMirror(Node root) {
    if (root == null) {
        return null;
    }
    // Recursively mirror the left and right subtrees
    Node leftMirror = findMirror(root.left);
    Node rightMirror = findMirror(root.right);
    // Swap the left and right children
    root.left = rightMirror;
    root.right = leftMirror;
    return root;
}