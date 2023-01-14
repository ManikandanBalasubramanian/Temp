package com.leetcode.medium;

public class LexographicallySmallestEquivalent {

    char [] parent = new char[26];  

    public char find(char ch) { 
        if(parent[ch - 'a'] == ch)
            return ch;
        
        return parent[ch - 'a'] = find(parent[ch - 'a']);
    }
    
    public void Union(char first, char second) {
         char ParentOfFirst = find(first);
        char ParentOfSecond = find(second);
 
        if(ParentOfFirst < ParentOfSecond) {
            parent[ParentOfSecond - 'a'] = ParentOfFirst;
        }
        else {
            parent[ParentOfFirst - 'a'] = ParentOfSecond;
        }
    }
    
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        int n = s1.length(); // extract size
        for(char c = 'a'; c <= 'z'; c++) {
            parent[c - 'a'] = c;
        }
        
        for(int i = 0; i < n; i++) {
            Union(s1.charAt(i), s2.charAt(i));
        }
        
        String ans = "";
        for(int i = 0; i < baseStr.length(); i++) {
            ans += find(baseStr.charAt(i));
        }
        
        return ans;
    }
}