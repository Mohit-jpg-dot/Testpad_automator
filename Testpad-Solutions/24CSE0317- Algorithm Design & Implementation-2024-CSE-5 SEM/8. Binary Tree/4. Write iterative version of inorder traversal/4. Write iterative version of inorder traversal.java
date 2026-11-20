static void printInorder(Node root) {
    if (root == null) {
        return;
    }
    java.util.Stack<Node> stack = new java.util.Stack<>();
    Node curr = root;
    StringBuilder sb = new StringBuilder();
    while (curr != null || !stack.isEmpty()) {
        // Reach the leftmost node of the curr node
        while (curr != null) {
            stack.push(curr);
            curr = curr.leftChild;
        }
        // Current must be null at this point, pop the top from the stack
        curr = stack.pop();
        // Append data separated by space
        if (sb.length() > 0) {
            sb.append(" ");
        }
        sb.append(curr.data);
        // We have visited the node and its left subtree. Now, it's right subtree's turn
        curr = curr.rightChild;
    }
    System.out.print(sb.toString());
}