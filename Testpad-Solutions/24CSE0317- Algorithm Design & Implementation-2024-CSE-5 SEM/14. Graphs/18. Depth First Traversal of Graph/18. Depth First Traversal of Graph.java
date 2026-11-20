void DFSUtil(int v, boolean visited[]) {
    // Mark the current node as visited and print it
    visited[v] = true;
    System.out.print(v + " ");
    // Recur for all the vertices adjacent to this vertex
    List<Integer> neighbors = adjVertices.get(v);
    if (neighbors != null) {
        for (int neighbor : neighbors) {
            if (!visited[neighbor]) {
                DFSUtil(neighbor, visited);
            }
        }
    }
}
void DFS(int v) {
    // Assuming the graph can have up to some max vertices, 
    // or we find the maximum vertex index to size our visited array properly.
    int maxVertex = 0;
    for (Integer vertex : adjVertices.keySet()) {
        if (vertex > maxVertex) {
            maxVertex = vertex;
        }
    }
    boolean[] visited = new boolean[maxVertex + 1];
    DFSUtil(v, visited);
}