package com.leetcode.medium;

public class CoinChangeII {
    public int change(int amount, int[] coins) {
        if (amount == 0)
            return 1;
        int n = coins.length;
        if (n == 0)
            return 0;

        int[] dp = new int[amount + 1];
        dp[0] = 1;

        for (int i = 1; i <= amount; i++) {
            dp[i] = (i < coins[0]) ? 0 : dp[i - coins[0]];
        }

        for (int j = 1; j < n; j++) {
            int[] next = new int[amount + 1];
            next[0] = 1;

            for (int i = 1; i <= amount; i++) {
                next[i] = dp[i] + ((i < coins[j]) ? 0 : next[i - coins[j]]);
            }
            dp = next;
        }

        return dp[amount];
    }
}