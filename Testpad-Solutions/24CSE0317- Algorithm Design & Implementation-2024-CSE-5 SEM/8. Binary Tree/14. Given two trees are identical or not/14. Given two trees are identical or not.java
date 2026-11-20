class Result {
    /*
     * @Input
     *   t1, t2 -> Given the root node of two binary trees
     * 
     * @Output
     *   Return 1 if the two binary trees are identical, else return 0
     */
    static int areSameTree(Node t1, Node t2) {
        // If both trees are empty, they are identical
        if (t1 == null && t2 == null) {
            return 1;
        }
        // If one of them is empty and the other is not, they are not identical
        if (t1 == null || t2 == null) {
            return 0;
        }
        // Check if current nodes have the same data and their left & right subtrees are identical
        if (t1.data == t2.data && 
            areSameTree(t1.left, t2.left) == 1 && 
            areSameTree(t1.right, t2.right) == 1) {
            return 1;
        }
        return 0;
    }
}