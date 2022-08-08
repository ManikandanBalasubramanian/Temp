package com.leetcode.easy;


public class ReverseVowelsOfaString {
    public String reverseVowels(String s) {
        int start = 0 ;
        int end = s.length() -1;
        char[] ch = s.toCharArray();
        
        while(start < end) {
            boolean endV = isVowel(ch[end]);
            boolean startV = isVowel(ch[start]);
            
            if(startV && endV) {
                char temp = ch[end];
                ch[end--] = ch[start];
                ch[start++] = temp;
            }
            
            if(!startV) start++;
            if(!endV) end--;
        }
        
        return new String(ch);
    }
    
    public boolean isVowel(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') || (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
    }
}