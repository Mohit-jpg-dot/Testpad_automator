void BFS(int v) {
    // Find the maximum vertex index to size our visited array properly
    int maxVertex = 0;
    for (Integer vertex : adjVertices.keySet()) {
        if (vertex > maxVertex) {
            maxVertex = vertex;
        }
    }
    boolean[] visited = new boolean[maxVertex + 1];
    java.util.Queue<Integer> queue = new java.util.LinkedList<>();
    visited[v] = true;
    queue.add(v);
    while (!queue.isEmpty()) {
        int curr = queue.poll();
        System.out.print(curr + " ");
        List<Integer> neighbors = adjVertices.get(curr);
        if (neighbors != null) {
            for (int neighbor : neighbors) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }
}