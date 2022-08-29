package com.leetcode.medium;

public class MinimumFallingPathSum {

    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        
        for ( int i = 0; i < n-1; i++) {
            for (int j = 0 ; j < n; j++) {
                int left = (j == 0) ? 0 : j-1;
                int right = (j == n-1) ? n-1 : j+1;
                matrix[i+1][j] += Math.min(matrix[i][left], Math.min(matrix[i][j], matrix[i][right]));
            }
        }
        
        int min = matrix[n-1][0];
        for(int val : matrix[n-1]) {
            min = Math.min(min, val);
        }
        
        return min;
    }
}