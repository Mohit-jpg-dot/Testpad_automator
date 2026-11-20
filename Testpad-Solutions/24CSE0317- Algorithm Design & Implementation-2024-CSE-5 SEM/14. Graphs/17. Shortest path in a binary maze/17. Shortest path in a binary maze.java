import java.util.Queue;
import java.util.LinkedList;
class Result {
    static int shortestPath(int mat[][], int srcR, int srcC, int destR, int destC, int m, int n) {
        // If source or destination is invalid or blocked
        if (srcR < 0 || srcR >= m || srcC < 0 || srcC >= n || 
            destR < 0 || destR >= m || destC < 0 || destC >= n || 
            mat[srcR][srcC] == 0 || mat[destR][destC] == 0) {
            return -1;
        }
        // If source is the destination
        if (srcR == destR && srcC == destC) {
            return 0;
        }
        boolean[][] visited = new boolean[m][n];
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(srcR, srcC, 0));
        visited[srcR][srcC] = true;
        // 4 possible directions: Up, Down, Left, Right
        int[] rowNum = {-1, 1, 0, 0};
        int[] colNum = {0, 0, -1, 1};
        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            // If we reached the destination, return the distance
            if (curr.row == destR && curr.col == destC) {
                return curr.dist;
            }
            for (int i = 0; i < 4; i++) {
                int nextR = curr.row + rowNum[i];
                int nextC = curr.col + colNum[i];
                // Check bounds, whether the cell is open (1), and not yet visited
                if (nextR >= 0 && nextR < m && nextC >= 0 && nextC < n && 
                    mat[nextR][nextC] == 1 && !visited[nextR][nextC]) {
                    visited[nextR][nextC] = true;
                    queue.add(new Node(nextR, nextC, curr.dist + 1));
                }
            }
        }
        return -1; // If no path exists
    }
    // Helper class to store cell coordinates and distance from source
    static class Node {
        int row, col, dist;
        Node(int row, int col, int dist) {
            this.row = row;
            this.col = col;
            this.dist = dist;
        }
    }
}