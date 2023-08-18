package com.leetcode.medium;

public class MaximalNetworkRank {

    public int maximalNetworkRank(int n, int[][] roads) {
        int result = 0;
        int[] degrees = new int[n];
        for (int[] road : roads) {
            ++degrees[road[0]];
            ++degrees[road[1]];
        }
        int first = 0;
        int second = 0;
        for (int degree : degrees) {
            if (degree > first) {
                second = first;
                first = degree;
            } else if (degree == first) {
                continue;
            } else if (degree > second) {
                second = degree;
            }
        }
        int firstCount = 0;
        int secondCount = 0;
        for (int degree : degrees) {
            if (degree == first) {
                ++firstCount;
            } else if (degree == second) {
                ++secondCount;
            }
        }
        if (firstCount == 1) {
            int count = 0;
            for (int[] road : roads) {
                if (degrees[road[0]] == first && degrees[road[1]] == second) {
                    ++count;
                } else if (degrees[road[1]] == first && degrees[road[0]] == second) {
                    ++count;
                }
            }
            return first + second - (secondCount > count ? 0 : 1);
        } else {
            int count = 0;
            for (int[] road : roads) {
                if (degrees[road[0]] == first && degrees[road[1]] == first) {
                    ++count;
                }
            }
            return first + first - (firstCount * (firstCount - 1) / 2 > count ? 0 : 1);
        }
    }
}