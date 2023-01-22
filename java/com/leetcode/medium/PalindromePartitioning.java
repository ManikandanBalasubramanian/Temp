package com.leetcode.medium;

import java.util.List;
import java.util.ArrayList;

public class PalindromePartitioning {

    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        partition(s.toCharArray(),res,0,new ArrayList<String>());
        return res;
    }

    private void partition(char[] s, List<List<String>> res, int idx, ArrayList<String> list){
        if(idx == s.length)
           res.add(new ArrayList<String>(list));
        
        for(int i = idx; i < s.length; i++) {
            if(isPalindrome(s, idx, i)) {
                list.add(String.valueOf(s, idx, i - idx + 1)); 
                partition(s, res, i + 1, list);
                list.remove(list.size()-1);
            }
        }
    }
 
    private boolean isPalindrome(char[] s, int i, int j) {
        while(i < j) {
            if(s[i++] != s[j--])
            return false;
        }
        return true;
    }
}