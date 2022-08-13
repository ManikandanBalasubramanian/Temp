package com.leetcode.medium;

public class SearchA2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        int start = 0, end = (m*n) -1;
        
        while(start <= end) {
            int mid = start + (end - start)/2;
            int r = mid / n;
            int c = mid % n;
            
            if(matrix[r][c] == target) {
                return true;
            } else if(matrix[r][c] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        
        return false;
    }
}