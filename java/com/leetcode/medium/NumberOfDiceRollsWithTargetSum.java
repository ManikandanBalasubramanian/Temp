package com.leetcode.medium;

import java.util.Map;
import java.util.HashMap;

public class NumberOfDiceRollsWithTargetSum {
    
    final Map<String, Integer> memo = new HashMap<>();
	final int MOD = 1000000007;
    
    public int numRollsToTarget(int n, int k, int target) {
        
        if (target > n * k || target < n) return 0;
		if (n == 1) return (target <= k) ? 1 : 0;
 
        final String key = "" + n + k + target;

		if (! memo.containsKey(key)) {   
			int currentSum = 0;

			for (int i = k; i > 0; i--) {
				currentSum += numRollsToTarget(n - 1, k, target - i);
				currentSum %= MOD;
			} 
			memo.put(key, currentSum);
		} 
		return memo.get(key);
	} 
}