package com.leetcode.medium;

import java.util.Arrays;

public class BagOfToken {

    public int bagOfTokensScore(int[] tokens, int power) {
        
        Arrays.sort(tokens);
        if (tokens.length == 0 || power < tokens[0]) return 0;
        
        int left = 0, right = tokens.length - 1, ans = 0, points = 0;
        
        while (left <= right) {
            if (power >= tokens[left]) {
                points++;
                power -= tokens[left++];
            } else if (right - left > 1) {
                    power += tokens[right];
                    right--;
                    points--;
            }
            else break;
            ans = Math.max(ans, points);
        }
        
        return ans;   
    }
}