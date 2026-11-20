// Return the root node of the tree
static Node buildTree(int arr[], int n) {
    if (n == 0 || arr == null) {
        return null;
    }
    Node root = new Node(arr[0]);
    java.util.Queue<Node> queue = new java.util.LinkedList<>();
    queue.offer(root);
    int i = 1;
    while (i < n && !queue.isEmpty()) {
        Node curr = queue.poll();
        // Assign left child
        if (i < n) {
            curr.left = new Node(arr[i]);
            queue.offer(curr.left);
            i++;
        }
        // Assign right child
        if (i < n) {
            curr.right = new Node(arr[i]);
            queue.offer(curr.right);
            i++;
        }
    }
    return root;
}