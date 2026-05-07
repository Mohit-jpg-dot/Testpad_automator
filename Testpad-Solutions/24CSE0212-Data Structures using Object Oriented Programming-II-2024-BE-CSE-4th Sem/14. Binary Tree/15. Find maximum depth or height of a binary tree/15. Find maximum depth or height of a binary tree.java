class Result {
  static int treeHeight(Node root) {
    if(root == null)
      return -1;
    int leftHeight = treeHeight(root.left);
    int rightHeight = treeHeight(root.right);
    return 1 + Math.max(leftHeight, rightHeight);
  }
}