package com.leetcode.medium;


public class SearchA2DMatrixII {

    public boolean searchMatrix(int[][] matrix, int target) {
        int topRow = -1;
        int topCol = -1;
        
        int row = matrix.length;
        int col = matrix[0].length;
        
    
        while(topRow < row && topCol < col && target >= matrix[topRow + 1][topCol + 1] && target <= matrix[row - 1][col - 1]) {
            topRow++;
            topCol++;
            row--;
            col--;

            int tempRow = topRow;
            
            while (tempRow >= 0 && row < matrix.length && tempRow <= row) {
                if (matrix[tempRow][topCol] == target) return true;
                if (matrix[tempRow][col] == target) return true;
                tempRow++;
            }

            int tempCol = topCol;
            while (tempCol >= 0 && col < matrix[0].length && tempCol <= col) {
                if (matrix[topRow][tempCol] == target) return true;
                if (matrix[row][tempCol] == target) return true;
                tempCol++;
            }
            
        }
                

        
        return false;
    }
}