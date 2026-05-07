class Result {
    static int isFoldable(Node root) {
        if(root == null)
            return 1;
        if(isMirror(root.left, root.right))
            return 1;
        else
            return 0;
    }
    static boolean isMirror(Node a, Node b){
        if(a == null && b == null)
            return true;
        if(a == null || b == null)
            return false;
        return isMirror(a.left, b.right) && isMirror(a.right, b.left);
    }
}