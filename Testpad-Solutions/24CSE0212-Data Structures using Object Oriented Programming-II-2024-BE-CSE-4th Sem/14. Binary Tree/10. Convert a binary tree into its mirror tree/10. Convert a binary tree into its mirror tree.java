static Node findMirror(Node root) {
    if(root == null)
        return null;
    Node left = findMirror(root.left);
    Node right = findMirror(root.right);
    root.left = right;
    root.right = left;
    return root;
}