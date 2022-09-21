package com.leetcode.easy;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;



public class RelativeSortArray {

	public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> freq = new HashMap<>();
        List<Integer> list = new ArrayList<>();
 
        
        for(int a : arr2) {
            freq.put(a, 0);
        }

        for(int a : arr1) {
            if(freq.containsKey(a)) {
                freq.put(a, freq.get(a) +1);
            } else {
                list.add(a);                
            }
        }
        
        Collections.sort(list);

        int index = 0;
        for(int a : arr2) {
            int i = freq.get(a);
            
            while(i > 0) {
                arr1[index++] = a;
                i--;
            }
        }
        
        for(int v : list) arr1[index++] = v;
        
        return arr1;        
    }
}