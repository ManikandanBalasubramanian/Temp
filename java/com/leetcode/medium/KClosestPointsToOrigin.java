package com.leetcode.medium;

import java.util.Arrays;

public class KClosestPointsToOrigin {

    public int[][] kClosest(int[][] points, int k) {
        
        Arrays.sort(points, 
                    (a, b) ->  Double.compare(Math.sqrt((a[0]*a[0]) + (a[1]*a[1])), Math.sqrt((b[0]*b[0]) + (b[1]*b[1])))
                   );
        
        return Arrays.copyOfRange(points, 0, k);
    }
}