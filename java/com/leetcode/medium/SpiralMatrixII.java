package com.leetcode.medium;

public class SpiralMatrixII {

    int val = 0;
    int loop = 0;
    
    public int[][] generateMatrix(int n) {
        int[][] output = new int[n][n];           
        right(0, n-1, 0, output);
                
        return output;
    }
    
    public void right(int start, int end, int i, int[][] mat) {
        if(start > end) return;
        while(start <= end) mat[i][start++] = ++val;
        down(i+1, mat.length-loop-1, --start, mat);
    }

    public void down(int start, int end, int j, int[][] mat) {
        if(start > end) return;
        while(start <= end) mat[start++][j] = ++val;
        left(j-1, loop, --start, mat);

    }

    public void left(int start, int end, int i, int[][] mat) {
        if(start < end) return;
        while(start >= end) mat[i][start--] = ++val;
        up(i-1, ++loop, ++start, mat);
    }

    
    public void up(int start, int end, int j, int[][] mat) {
        if(start < end) return;
        while(start >= end) mat[start--][j] = ++val;
        right(j+1, mat.length-loop-1, ++start, mat);
    }
        
    
}