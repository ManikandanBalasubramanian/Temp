package com.leetcode.easy;

public class MergeSortedArray {

    public void merge(int[] a, int m, int[] b, int n) {
                
        int i = m-1, j = n-1, index = m+n-1;            
        
        while(i >= 0 && j >= 0) {
            if(a[i] < b[j]) {
                a[index--] = b[j--];
            } else {
                a[index--] = a[i--];
            }
        }
        
        while(j >= 0) a[index--] = b[j--];        
    }
}