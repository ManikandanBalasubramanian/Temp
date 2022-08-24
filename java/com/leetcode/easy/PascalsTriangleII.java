package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {

    public List<Integer> getRow(int rowIndex) {
        
        List<Integer> output = new ArrayList<>();
        
        for( int i=0 ; i<= rowIndex ; i++) {
            List<Integer> list = new ArrayList<>();
            
            for(int j = 0; j<=i;j++){
                
                if(j==0 || j==i) {
                    list.add(1);    
                } else {
                    list.add(output.get(j) + output.get(j-1)); 
                }    
            }
            
            output = list;
        }
        
        return output;
    }
}