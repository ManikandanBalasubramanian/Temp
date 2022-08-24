package com.leetcode.hard;

public class MinimumNumberOfRefuelingStops {

    public int minRefuelStops(int target, int startFuel, int[][] stations) {
       int n = stations.length;
        long[] petrol = new long[n + 1];
        petrol[0] = startFuel;
        
        for (int i = 0; i < n; ++i)
            for (int t = i; t >= 0; --t)
                if (petrol[t] >= stations[i][0])
                    petrol[t+1] = Math.max(petrol[t+1], petrol[t] + (long) stations[i][1]);

        for (int i = 0; i <= n; ++i)
            if (petrol[i] >= target) return i;
        
        return -1;
    }
}