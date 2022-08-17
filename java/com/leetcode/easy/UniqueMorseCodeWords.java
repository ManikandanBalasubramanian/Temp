package com.leetcode.easy;

import java.util.Set;
import java.util.HashSet;

public class UniqueMorseCodeWords {

    static String[] dict =  {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> set = new HashSet<String>();
        for(String word :words) {
            String s = "";
            for(char c : word.toCharArray()) {
                s += dict[c-'a'];
            }
            set.add(s);
        }
        
        return set.size();
    }
}