package com.leetcode.easy;

import java.util.StringBuilder;

public class DefangingAnIPAddress {
	public String defangIPaddr(String address) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.')
                sb.append("[.]");
            else
                sb.append(address.charAt(i));
        }
        
        return sb.toString();
    }
}