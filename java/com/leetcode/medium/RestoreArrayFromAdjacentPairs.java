package com.leetcode.medium;

public class RestoreArrayFromAdjacentPairs {

    public int[] restoreArray(int[][] adjacentPairs) {
        Map<Integer, List<Integer>> adj = new HashMap<>();
        for (int[] pair : adjacentPairs) {
            adj.computeIfAbsent(pair[0], l -> new ArrayList<>()).add(pair[1]);
            adj.computeIfAbsent(pair[1], s -> new ArrayList<>()).add(pair[0]);
        }
        int n = adjacentPairs.length + 1, k = 0;
        int[] ans = new int[n];
        for (var e : adj.entrySet()) {
            if (e.getValue().size() == 1) {
                ans[0] = e.getKey();
                break;
            }
        }
        Integer prev = null;
        while (k < n - 1) {
            for (int next : adj.remove(ans[k])) {
                if (prev == null || next != prev) {
                    prev = ans[k];
                    ans[++k] = next;
                    break;
                }
            }
        }
        return ans;
    }
}