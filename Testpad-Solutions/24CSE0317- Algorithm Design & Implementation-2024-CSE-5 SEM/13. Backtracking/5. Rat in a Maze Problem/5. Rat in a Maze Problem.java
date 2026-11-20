class Result {
    public static int solveMaze(int maze[][], int size) {
        if (maze == null || size == 0 || maze[0][0] == -1 || maze[size - 1][size - 1] == -1) {
            return 0;
        }
        int[] count = {0};
        boolean[][] visited = new boolean[size][size];
        findPaths(maze, 0, 0, size, visited, count);
        return count[0];
    }
    private static void findPaths(int[][] maze, int r, int c, int size, boolean[][] visited, int[] count) {
        // Destination reached
        if (r == size - 1 && c == size - 1) {
            count[0]++;
            return;
        }
        // Mark current cell as visited
        visited[r][c] = true;
        // Move Right (c + 1)
        if (c + 1 < size && maze[r][c + 1] == 0 && !visited[r][c + 1]) {
            findPaths(maze, r, c + 1, size, visited, count);
        }
        // Move Down (r + 1)
        if (r + 1 < size && maze[r + 1][c] == 0 && !visited[r + 1][c]) {
            findPaths(maze, r + 1, c, size, visited, count);
        }
        // Backtrack: unmark the current cell so other paths can use it
        visited[r][c] = false;
    }
}