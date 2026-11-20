static void printLevelWise(Node root) {
    if (root == null) {
        return;
    }
    java.util.Queue<Node> queue = new java.util.LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
        int levelSize = queue.size();
        StringBuilder levelStr = new StringBuilder();
        for (int i = 0; i < levelSize; i++) {
            Node curr = queue.poll();
            levelStr.append(curr.data);
            if (i < levelSize - 1) {
                levelStr.append(" ");
            }
            if (curr.left != null) {
                queue.add(curr.left);
            }
            if (curr.right != null) {
                queue.add(curr.right);
            }
        }
        System.out.println(levelStr.toString());
    }
}