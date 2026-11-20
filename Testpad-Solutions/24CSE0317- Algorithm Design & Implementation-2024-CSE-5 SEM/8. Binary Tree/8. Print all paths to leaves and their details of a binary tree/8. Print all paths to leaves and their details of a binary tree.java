static void printAllPaths(Node root) {
    if (root == null) {
        return;
    }
    java.util.List<String> paths = new java.util.ArrayList<>();
    findPaths(root, new java.util.ArrayList<>(), paths);
    // Print each path
    for (String path : paths) {
        System.out.println(path);
    }
    // Print the total number of paths at the end
    System.out.println(paths.size());
}
private static void findPaths(Node node, java.util.List<Integer> currentPath, java.util.List<String> paths) {
    if (node == null) {
        return;
    }
    currentPath.add(node.data);
    // If it's a leaf node, build the path string with its length (number of edges)
    if (node.left == null && node.right == null) {
        int length = currentPath.size() - 1; // Length in terms of edges
        StringBuilder sb = new StringBuilder();
        for (int val : currentPath) {
            sb.append(val).append(" ");
        }
        sb.append(length);
        paths.add(sb.toString());
    } else {
        // Recurse left and right
        findPaths(node.left, currentPath, paths);
        findPaths(node.right, currentPath, paths);
    }
    // Backtrack
    currentPath.remove(currentPath.size() - 1);
}