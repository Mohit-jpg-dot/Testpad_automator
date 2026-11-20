class Result {
    static void printOdd(Node root) {
        if (root == null) {
            return;
        }
        java.util.Queue<Node> queue = new java.util.LinkedList<>();
        queue.add(root);
        int level = 1; // Root is at level 1 (odd level)
        StringBuilder sb = new StringBuilder();
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                Node curr = queue.poll();
                // If the level is odd, print/store the node data
                if (level % 2 != 0) {
                    if (sb.length() > 0) {
                        sb.append(" ");
                    }
                    sb.append(curr.data);
                }
                if (curr.left != null) {
                    queue.add(curr.left);
                }
                if (curr.right != null) {
                    queue.add(curr.right);
                }
            }
            level++; // Move to the next level
        }
        System.out.print(sb.toString());
    }
}