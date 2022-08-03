package com.leetcode.medium;

import java.util.List;
import java.util.ArrayList;


public class PartitionLabels {
	    public List<Integer> partitionLabels(String s) {
        int [][] startEnd = new int[2][26];
        
        for(int i = 0; i < s.length(); i++) {
            
            if(startEnd[0][s.charAt(i) - 'a'] != 0) {
                startEnd[1][s.charAt(i) - 'a'] = i+1;
                
            } else {
                startEnd[0][s.charAt(i) - 'a'] = i+1;
                startEnd[1][s.charAt(i) - 'a'] = i+1;
            }
        }
 
        List<Time> list = new ArrayList<>();
        
        for (int j = 0; j < s.length(); j++) {
            
            int i = s.charAt(j) - 'a';
            
            boolean b = true;
            for(Time t : list) {
                if(!t.check(startEnd[0][i], startEnd[1][i])) {
                    b = false;
                    break;
                }
            }
            
            if(b) list.add(new Time(startEnd[0][i], startEnd[1][i]));
            
        }
        
        // System.out.println(list);
        
        
        List<Integer> output =  new ArrayList<>();
        for(Time t : list) {
            if(t.end != 0 && t.start != 0)  output.add((t.end - t.start) +1);
        }
        
        // System.out.println(output);
        
        return output;
    }
}


class Time {
    int start;
    int end;
    
    Time(int start, int end) {
        this.start = start;
        this.end = end;
    }
    
    public boolean check(int s, int e) {
         if((s <= start && e <= start) || ( s >= end && e >= end)) {
             return true;
         } else {
             this.start = Math.min(start, s);
             this.end = Math.max(end, e);
             return false;
         }
    }
    
    @Override
    public String toString() {
        return "s: " + this.start + " e: " + this.end;
    }
    
}