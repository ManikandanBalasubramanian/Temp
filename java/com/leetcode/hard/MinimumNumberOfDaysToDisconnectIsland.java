package com.leetcode.hard;

public class MinimumNumberOfDaysToDisconnectIsland {
    int[] row = { 1, -1, 0, 0 };
    int[] col = { 0, 0, 1, -1 };
 

    public int minDays(int[][] grid) {

        if (count(grid) != 1)
            return 0;
        int n = grid.length;
        int m = grid[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    grid[i][j] = 0;
                    if (count(grid) != 1)
                        return 1;
                    grid[i][j] = 1;
                }
            }
        }

        return 2;
    }

    private int count(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int isLand = 0;
        boolean[][] vis = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1 && !vis[i][j]) {
                    dfs(grid, i, j, vis);
                    isLand++;
                }
            }
        }
        return isLand;
    }

    private void dfs(int[][] grid, int r, int c, boolean[][] vis) {
        vis[r][c] = true;
        int temp = 0;
        for (int i = 0; i < 4; i++) {
            int tr = r + row[i];
            int tc = c + col[i];

            if (tr >= 0 && tc >= 0 && tr < grid.length && tc < grid[0].length && grid[tr][tc] == 1 && !vis[tr][tc]) {

                dfs(grid, tr, tc, vis);
            }
        }

    }
}