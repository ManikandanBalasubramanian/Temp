package com.leetcode.medium;

public class RotateImage {
	
	public void rotate(int[][] matrix) {
        int n = matrix.length;
        
        for(int i = 0 ; i < n/2 ; i++) {
            for(int j = i; j < n-1-i; j++) {
                
                int curri = i;
                int curj = j;
                for(int k = 0; k < 3 ; k++) {
                    int temp = matrix[curri][curj];

                    int nexti = n-1-curj;
                    int nextj = curri;
                    
                    matrix[curri][curj] = matrix[nexti][nextj];
                    matrix[nexti][nextj] = temp;
                    
                    curri = nexti;
                    curj = nextj;
                }
                
            }
        }
    }
}