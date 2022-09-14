package com.leetcode.easy;

public class LicenseKeyFormatting {

    public String licenseKeyFormatting(String s, int k) {
        s = s.replaceAll("-","").toUpperCase();    
 
        if(s.length() == 0) return "";
        int firstGroupLen = (s.length() % k) == 0 ? k : s.length()%k;

        String output = s.substring(0, firstGroupLen);
        
        for(int i = firstGroupLen; i < s.length() ; i++) {
            if( (i- firstGroupLen)%k == 0) output += "-";
            output +=  s.charAt(i);
        }
        return output;
    }
}