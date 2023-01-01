package com.leetcode.easy;

public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        return word.matches("[A-Z]*|.[a-z]*");
    }
}