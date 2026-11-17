class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean visited[][] = new boolean[n][m];
        int c = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j] && grid[i][j] == '1') {
                    bfs(visited, grid, i, j, n, m);
                    c++;
                }
            }
        }
        return c;
    }

    void bfs(boolean[][] visited, char[][] grid, int i, int j, int n, int m) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] { i, j });
        visited[i][j] = true;
        while (!q.isEmpty()) {
            int a[] = q.poll();
            int u = a[0];
            int v = a[1];
            int[][] dir = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

            for (int[] d : dir) {
                int row = u + d[0];
                int col = v + d[1];
                if (row >= 0 && col >= 0 && row < n && col < m) {
                    if (!visited[row][col] && grid[row][col] == '1') {
                        visited[row][col] = true;
                        q.add(new int[] { row, col });
                    }
                }
            }

        }
    }
}