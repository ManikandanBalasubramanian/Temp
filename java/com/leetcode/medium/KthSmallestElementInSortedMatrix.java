package com.leetcode.medium;

public class KthSmallestElementInSortedMatrix {

    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int[] mat = matrix [0];
        
        for(int i = 0 ; i < n-1; i++) {
            mat = mergeTwoArr(mat, matrix[i+1]);
        }
        
        return mat[k-1];
    }
    
    public int[] mergeTwoArr(int[] a, int[] b) {
        int i = 0, j = 0, index = 0;
        int [] temp = new int [a.length + b.length];
        
        while ( i < a.length && j < b.length) {
            if (a[i] < b [j]) {
                temp[index++] = a[i++];
            } else {
                temp[index++] = b[j++];
            }
        }
        
        while (j < b.length) temp[index++] = b[j++];
        
        while (i < a.length) temp[index++] = a[i++];
        
        return temp;
    }
}