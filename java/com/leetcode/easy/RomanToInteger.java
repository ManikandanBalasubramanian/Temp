package com.leetcode.easy;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;

public class RomanToInteger {

    Map<Character, Integer> c = new HashMap<>();
    
    public int romanToInt(String s) {
        c.put('I',1);
        c.put('V',5);
        c.put('X',10);
        c.put('L',50);
        c.put('C',100);
        c.put('D',500);
        c.put('M',1000);
        
        List<Character> ind = Arrays.asList('I', 'V', 'X', 'L','C','D','M');
        char[] carr = s.toCharArray();
        int len = carr.length;
        
        int sum = 0;
        for(int i = len-1; i >= 0 ; i-- ) {
            
            int index = ind.indexOf(carr[i]);
            sum += c.get(carr[i]);
            
            if(i < len-1 ) {
                int prevIn = ind.indexOf(carr[i+1]);
                if((prevIn - (2 - (prevIn&1))) == index) {
                  sum -= 2*c.get(carr[i]);  
                }           
            }
        }
        
        return sum;
    }
}