class Result {
    static int countLeafs(Node root) {
        if(root == null)
            return 0;
        if(root.left == null && root.right == null)
            return 1;
        return countLeafs(root.left) + countLeafs(root.right);
    }
    static int countNonLeafs(Node root) {
        if(root == null || (root.left == null && root.right == null))
            return 0;
        return 1 + countNonLeafs(root.left) + countNonLeafs(root.right);
    }
}