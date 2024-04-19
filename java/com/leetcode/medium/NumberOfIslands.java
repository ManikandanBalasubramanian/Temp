package com.leetcode.medium;

public class NumberOfIslands {

    public int numIslands(char[][] grid) {        
        
        int count = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0 ; j < grid[0].length; j++) {
                if(grid[i][j] == '1') {
                    countIsland(grid, i, j);
                    count++;
                }
            }
        }
        
        return count;
    }
    
    public char[][] countIsland(char[][] grid, int sr, int sc) {
        
        if(sr < 0 || sr >= grid.length || sc < 0 || sc >= grid[0].length ) return grid;
        
        if(grid[sr][sc] == '1') {
            grid[sr][sc] = 'x';
            countIsland(grid, sr +1, sc);
            countIsland(grid, sr - 1, sc);
            countIsland(grid, sr, sc + 1);
            countIsland(grid, sr, sc - 1);
        }
        
        return grid;
    }
   
}