class Result {
    static void printOdd(Node root) {
        if(root == null)
            return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int level = 1;
        boolean first = true;
        while(!q.isEmpty())
        {
            int size = q.size();
            for(int i = 0; i < size; i++)
            {
                Node temp = q.poll();
                if(level % 2 != 0)
                {
                    if(!first)
                        System.out.print(" ");
                    System.out.print(temp.data);
                    first = false;
                }
                if(temp.left != null)
                    q.add(temp.left);
                if(temp.right != null)
                    q.add(temp.right);
            }
            level++;
        }
    }
}