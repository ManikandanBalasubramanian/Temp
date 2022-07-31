package com.leetcode.medium;

import java.util.List;
import java.util.ArrayList;

public class WordSubsets {

    public List<String> wordSubsets(String[] words1, String[] words2) {

        int[][] words1Arr = new int[words1.length][26];
        List<String> list = new ArrayList<>();
        
        for(int i = 0 ; i < words1.length; i++) {
            for(char c : words1[i].toCharArray()) {
                words1Arr[i][c-97]++;
            }   
        }
        
        int[] maxArr = new int[26];
        
        for(int i = 0 ; i < words2.length; i++) {
            int[] temp = new int[26];
            for(char c : words2[i].toCharArray()) {
                temp[c-97]++;
            }
            
            for(int j = 0; j < 26; j++) {
                if(maxArr[j] < temp[j]) maxArr[j] = temp[j];
            }
        }
        
        for(int i = 0; i < words1.length; i++) {
            boolean b = true;
            
            for(int j = 0 ; j < 26 ; j++ ){ 
                if(words1Arr[i][j] < maxArr[j]) {
                    b = false;
                    break;
                }
            }
            
            if(b) list.add(words1[i]);
        }
        
        
        return list;   
    }   
}