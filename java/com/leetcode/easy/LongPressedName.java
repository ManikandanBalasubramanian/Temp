package com.leetcode.easy;

import java.lang.StringBuilder;

public class LongPressedName {
    public boolean isLongPressedName(String name, String typed) {
         
        StringBuilder builder = new StringBuilder();
        int i = 0;
        int j = 0;
        while (i < typed.length()) {
            if(j < name.length() && typed.charAt(i) == name.charAt(j)) {
                builder.append(typed.charAt(i));
                i++;
                j++;
            } else if(i > 0 && typed.charAt(i) == typed.charAt(i-1)) {
                i++;
            } else {
                return false;
            }
        }
        
        return builder.toString().equals(name);
    }
}