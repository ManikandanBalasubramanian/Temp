package com.leetcode.easy;

class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
     
        String s = "";
        if(strs.length == 0 || strs[0].length() == 0 ) {
            return "";
        }
        
        for(int i = 0; i < strs[0].length() ; i++ ) {
            
            for(int j = 0 ; j < strs.length ; j++ ) {
                
                if(i < strs[j].length()) {
                   if(strs[0].charAt(i) != strs[j].charAt(i)){
                       return s;
                   } 
                } else {
                    return s;
                }
            }
            s = s + strs[0].charAt(i);
        }
        
        return s;
    }
}