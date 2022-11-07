package com.leetcode.easy;

import java.util.StringBuilder;

public class Maximum69Number {

	public int maximum69Number (int num) {
        StringBuilder numSB = new StringBuilder();
        numSB.append(num);
        
        for (int i = 0; i < numSB.length(); ++i) {
            if (numSB.charAt(i) == '6') {
                numSB.setCharAt(i, '9');
                break;
            }
        }
        
        return Integer.parseInt(numSB.toString());
    }
}