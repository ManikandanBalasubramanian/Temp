package com.leetcode.easy;

public class 1bit2bitCharacters {

    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        while (i < bits.length) {
            if (i == bits.length-1) return true;
            i += bits[i] + 1;
        }
        return false;
    }
}