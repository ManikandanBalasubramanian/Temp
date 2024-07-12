package com.leetcode.medium;

public class MaximumScoreFromRemovingSubstrings {
    
    String str;
    int score;

    public int maximumGain(String s, int x, int y) {
        this.str = s;
        this.score = 0;

        if (x > y) {
            getScore(x, "ab");
            getScore(y, "ba");
        } else {
            getScore(y, "ba");
            getScore(x, "ab");
        }
        
        return score;
    }

    private void getScore(int points, String pattern) {
        StringBuilder stack = new StringBuilder();
        char firstChar = pattern.charAt(0);
        char secondChar = pattern.charAt(1);

        for (char c : str.toCharArray()) {
            if (c == secondChar && stack.length() > 0 && stack.charAt(stack.length() - 1) == firstChar) {
                stack.deleteCharAt(stack.length() - 1);
                score += points;
            } else {
                stack.append(c);
            }
        }

        str = stack.toString();
    }
}