package com.leetcode.easy;

public class MatrixDiagonalSum {

    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for(int i=0, end=mat.length -1; i<mat.length; i++, end--) {
            sum += mat[i][i] + mat[i][end];
            if (i == end)
                sum -= mat[i][end];
        }
        return sum;
    }
}