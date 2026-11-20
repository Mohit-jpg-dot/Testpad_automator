import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int V = sc.nextInt();
        int E = sc.nextInt();
        // Initialize adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        // Read directed edges
        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);
        }
        int src = sc.nextInt();
        int dest = sc.nextInt();
        // Check if path exists using BFS / DFS
        if (hasPath(V, adj, src, dest)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
    private static boolean hasPath(int V, ArrayList<ArrayList<Integer>> adj, int src, int dest) {
        if (src == dest) {
            return true;
        }
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(src);
        visited[src] = true;
        while (!queue.isEmpty()) {
            int curr = queue.poll();
            if (curr == dest) {
                return true;
            }
            for (int neighbor : adj.get(curr)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
        return false;
    }
}