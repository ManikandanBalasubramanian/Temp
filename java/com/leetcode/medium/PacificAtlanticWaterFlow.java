package com.leetcode.medium;

import java.util.List;
import java.util.ArrayList;

public class PacificAtlanticWaterFlow {

	    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        
        
        int m = heights.length;
        int n = heights[0].length;
        
        List<List<Integer>> res = new ArrayList<>();
        
        boolean[][] pacificVisited = new boolean[m][n];
        boolean[][] atlanticVisited = new boolean[m][n];
        
        
        // call dfs on boundary elements, while searching for the bigger (higher) neighbors of each elements
        for(int row = 0; row < m; row++){
            dfs(heights, Integer.MIN_VALUE, row, 0, pacificVisited);
            dfs(heights, Integer.MIN_VALUE, row, n - 1, atlanticVisited);

        }
        
        for(int col = 0; col < n; col++){
            dfs(heights, Integer.MIN_VALUE, 0, col, pacificVisited);
            dfs(heights, Integer.MIN_VALUE, m - 1, col, atlanticVisited);

        }
        
        // all those cells which are present in both oceans' visited array, will be added to result
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(pacificVisited[i][j] && atlanticVisited[i][j]){
                    List<Integer> cell = new ArrayList<>();
                    cell.add(i);
                    cell.add(j);
                    res.add(cell);
                }
            }
        }
        
   
        return res;
        
    }
    
    static void dfs(int[][] heights,  int height, int row, int col, boolean[][] visited){
        
        
        if(row < 0 || col < 0 || row >= heights.length || col >=  heights[0].length || visited[row][col] || heights[row][col] < height){
            
            return;
            
        } 
        
        visited[row][col] = true; 
        height = heights[row][col];
        
        dfs(heights, height, row - 1, col, visited);
        dfs(heights, height, row + 1, col, visited);
        dfs(heights, height, row, col - 1, visited);
        dfs(heights, height, row, col + 1, visited);
        
        
        return;
        
        
    }
}