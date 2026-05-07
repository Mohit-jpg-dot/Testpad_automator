static void printInorder(Node root)
{
    Stack<Node> stack = new Stack<>();
    Node curr = root;
    while(curr != null || !stack.isEmpty())
    {
        while(curr != null)
        {
            stack.push(curr);
            curr = curr.leftChild;
        }
        curr = stack.pop();
        System.out.print(curr.data + " ");
        curr = curr.rightChild;
    }
}