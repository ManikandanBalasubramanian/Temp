package com.leetcode.easy;

public class CountAsteriks {

    public int countAsterisks(String s) {
        int asteriks = 0;
        int lines = 0;
        for (char c: s.toCharArray()){
            switch (c) {
            case '*': if (lines%2==0)asteriks++; break;
            case '|': lines++; break;
            default: break;
            }
        }
        return asteriks;
    }
}