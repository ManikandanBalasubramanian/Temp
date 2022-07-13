package com.leetcode.hard;

import java.util.Arrays;

public class WildCardMatching {

	public boolean isMatch(String s, String p) {
	  	int sLen = s.length();
		int pLen = p.length();

		if (pLen == 0) {
		    return (sLen == 0);
		}

		if(pLen != sLen && !p.contains("*")) {
		    return false;
		}

		boolean[][] lookup = new boolean[sLen + 1][pLen + 1];

		for (int i = 0; i < sLen + 1; i++) {
		    Arrays.fill(lookup[i], false);
		}
		lookup[0][0] = true;

		for (int j = 0; j < pLen; j++) {
		    if (p.charAt(j) == '*') {
				lookup[0][j + 1] = lookup[0][j];
		    }
		}
		for (int i = 0 ; i < sLen; i++)
		{
		    for (int j = 0; j < pLen; j++)
		    {
				if (p.charAt(j) == '*') {
				    lookup[i + 1][j + 1] = lookup[i + 1][j] || lookup[i][j + 1];
				} else if (p.charAt(j) == '?' || s.charAt(i) == p.charAt(j)) {
				    lookup[i + 1][j + 1] = lookup[i][j];
				} else {
				    lookup[i + 1][j + 1] = false;
				}
		    }
		}

		return lookup[sLen][pLen];
	}
}