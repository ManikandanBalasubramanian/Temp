package com.leetcode.medium;

public class CountAllPossibleRoutes {
    int n, dp[][], cs[], dest, mod = 1_000_000_007;

    public int countRoutes(int[] locations, int fr, int to, int f) {
        cs = locations;
        n = cs.length;
        dp = new int[n][f + 1];
        dest = to;
        for (int i = 0; i < n; i++)
            Arrays.fill(dp[i], -1);
        return dfs(fr, f); // route fr...dest
    }

    private int dfs(int fr, int f) {
        if (f < 0)
            return 0;
        if (dp[fr][f] > -1)
            return dp[fr][f];
        int res = fr == dest ? 1 : 0;
        for (int i = 0; i < n; i++) {
            if (i == fr)
                continue;
            res = (res + dfs(i, f - Math.abs(cs[i] - cs[fr]))) % mod; // route fr -> i ... dest;
        }
        dp[fr][f] = res;
        return dp[fr][f];
    }
}