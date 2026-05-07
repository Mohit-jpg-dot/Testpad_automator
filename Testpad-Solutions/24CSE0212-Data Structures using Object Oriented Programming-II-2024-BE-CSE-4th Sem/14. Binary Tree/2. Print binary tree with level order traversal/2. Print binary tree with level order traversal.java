static void printLevelWise(Node root) {
    if(root == null)
        return;
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    while(!q.isEmpty())
    {
        int size = q.size();
        for(int i = 0; i < size; i++)
        {
            Node temp = q.poll();
            System.out.print(temp.data);
            if(i < size-1)
                System.out.print(" ");
            if(temp.left != null)
                q.add(temp.left);
            if(temp.right != null)
                q.add(temp.right);
        }
        System.out.println();
    }
}