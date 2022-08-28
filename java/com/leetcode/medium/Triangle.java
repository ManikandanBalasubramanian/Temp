package com.leetcode.medium;

import java.util.List;

public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        int rows = triangle.size();
        int len = (int) (rows * (rows +1))/2;
        int index = len - 1;
        
        int[] triArr = new int[len];
        
        for(int i = rows-1; i >= 0; i--) {
            
            List<Integer> temp = triangle.get(i);
            for(int j = i; j > 0; j--) {
                
                int indx = index - i - 1;
                int n = temp.get(j);
                int n1 = temp.get(j-1);
                
                triArr[indx] = Math.min(n+triArr[index], n1+triArr[index-1]);
                triArr[index] = n + triArr[index--];
        
            }
            triArr[index--] += temp.get(0);            
        }
                
        return triArr[0];
    }
}