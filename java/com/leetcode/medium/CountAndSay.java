package com.leetcode.medium;

public class CountAndSay {

	public String countAndSay(int n) {
        String s = "1";
        
        for(int i = 1; i < n ; i++) {
            String tempS = "";
            int start = 0;
            int end = 1;
            
            for( ; end < s.length(); end++) {  
                                
                if(start != end && s.charAt(start) != s.charAt(end)) {
                    tempS = tempS + (end - start) + s.charAt(start);
                    start = end;
                }
            }
            
            tempS = tempS + (end - start) + s.charAt(start);
            s = tempS;
        }
        
        return s;
    }
}