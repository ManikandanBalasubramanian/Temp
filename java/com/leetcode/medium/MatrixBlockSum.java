package com.leetcode.medium;


public class MatrixBlockSum {

	public int[][] matrixBlockSum(int[][] mat, int k) {
        int row = mat.length;
        int col = mat[0].length;
        int[][] answer = new int[row][col];
        
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                answer[i][j] = sum(mat, i, j, k);                        
            }
        }
        
        return answer;
    }
    
    
    public int sum(int mat[][], int i, int j, int k) {
       
        int row = mat.length;
        int col = mat[0].length;
        int sum = 0;
        
        int rowStart = (i - k) < 0 ? 0 : (i-k);
        int rowEnd = (i + k) >= mat.length ? (mat.length-1) : (i + k);
        int colStart = (j - k) < 0 ? 0 : (j - k);
        int colEnd = (j + k) >= mat[0].length ? (mat[0].length -1) : (j + k);
                
        for(;rowStart <= rowEnd; rowStart++) {
            for(int cs = colStart; cs <= colEnd; cs++) {
                sum += mat[rowStart][cs] ;
            }
        }
        
        return sum;
    }
}