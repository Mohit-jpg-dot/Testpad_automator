class Result {
    static Node insert(Node root, int val)
    {
        if(root == null)
            return new Node(val);
        if(val < root.data)
            root.leftChild = insert(root.leftChild, val);
        else
            root.rightChild = insert(root.rightChild, val);
        return root;
    }
    static Node buildSearchTree(int t[], int n) {
        Node root = null;
        for(int i = 0; i < n; i++)
        {
            root = insert(root, t[i]);
        }
        return root;
    }
}