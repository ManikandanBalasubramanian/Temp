package com.leetcode.medium;

public class MaximumNumberOfPointsWithCost {
    
    public long maxPoints(int[][] points) {
        int m = points.length;
        int n = points[0].length;

        long[] prev = new long[n];

        for (int i = 0; i < m; i++) {
            long[] curr = new long[n];

            // Left-to-right sweep
            long maxLeft = prev[0];
            for (int j = 0; j < n; j++) {
                maxLeft = Math.max(maxLeft, prev[j] + j);
                curr[j] = points[i][j] + maxLeft - j;
            }

            // Right-to-left sweep
            long maxRight = prev[n - 1] - (n - 1);
            for (int j = n - 1; j >= 0; j--) {
                maxRight = Math.max(maxRight, prev[j] - j);
                curr[j] = Math.max(curr[j], points[i][j] + maxRight + j);
            }

            // Update the previous row array
            prev = curr;
        }

        // The result is the maximum value in the last `prev` array
        long ans = 0;
        for (long val : prev) {
            ans = Math.max(ans, val);
        }

        return ans;
    }
}
