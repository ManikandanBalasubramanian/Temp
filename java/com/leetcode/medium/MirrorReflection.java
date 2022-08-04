package com.leetcode.medium;


public class MirrorReflection {
    public int mirrorReflection(int p, int q) {
        if(p == q) return 1;
        
        if ( (p&1) == 1) return q&1;
        
        if ( isPowOf2(p)) return 2;
        
        double d = (double) p / (double) q;
        
        if (d % 2 == 0) return 2;
        if (d % 2 == 1) return 1;

        boolean top = true, right = true, left = false, bottom = false;
        int x = q;
        
        
        while (p != q) {
                        
            q += x;

            
            if(q > p) {
                
                q = q%p;
                
                if(right && top) {
                    left = true;
                    right = false;
                    bottom = true;
                    top = false;
                } else if (right && bottom) {
                    left = true;
                    right = false;
                    bottom = false;
                    top = true;
                } else if (left && bottom) {
                    left = false;
                    right = true;
                    bottom = false;
                    top = true;
                } else if (left && top) {
                    left = false;
                    right = true;
                    bottom = true;
                    top = false;
                }
                
                
            } else if(q < p)  {
                
                if(right) {
                    left = true;
                    right = false;
                } else if (left) {
                    left = false;
                    right = true;
                } else if (bottom) {
                    bottom = false;
                    top = true;
                } else {
                    top = false;
                    bottom =  true;
                }
            }            
        }
        
        
        if (!top && (left || right)) return 0;
        
        if (!bottom) {
            if(!left) return 2;
            return 1;         
        }
        
        
        return 0;
}
    
    
    public boolean isPowOf2(int p) {
        int count = 0;
        
        while(p > 0) {
            if( (p&1) == 1) {
                if (count >= 1) {
                    return false;
                } else {
                    count++;
                }
            }
            p/=2;
        }
        return true;
    }
    
}