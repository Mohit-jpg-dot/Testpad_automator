import java.util.Scanner;
import java.util.ArrayList;
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
        // Read undirected edges
        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean[] visited = new boolean[V];
        boolean hasCycle = false;
        // Check for cycles in all components (since graph may be disconnected)
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (isCyclicDFS(i, -1, visited, adj)) {
                    hasCycle = true;
                    break;
                }
            }
        }
        if (hasCycle) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
    private static boolean isCyclicDFS(int curr, int parent, boolean[] visited, ArrayList<ArrayList<Integer>> adj) {
        visited[curr] = true;
        for (int neighbor : adj.get(curr)) {
            if (!visited[neighbor]) {
                if (isCyclicDFS(neighbor, curr, visited, adj)) {
                    return true;
                }
            } else if (neighbor != parent) {
                // If an adjacent vertex is visited and not the parent, then there is a cycle
                return true;
            }
        }
        return false;
    }
}