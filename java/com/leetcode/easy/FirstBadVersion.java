package com.leetcode.easy;


public class FirstBadVersion extends VersionControl {
    public int firstBadVersion(int n) {    
       int l1 = 0, r1 = n, m1 = 0;  
        
        while(l1 <= r1) {
            m1 = (r1-l1)/2 + l1; 
            
            if(isBadVersion(m1)) {
                r1 = m1 - 1;
            } else {
                l1 = m1 + 1;
            }
        }
        
        return l1;
    }
}

/* This is a dummy class because implementation of the below class is hidden. */
class VersionControl {
	boolean isBadVersion(int version) {
		return true;
	}
}