package com.leetcode.hard;

import java.util.*;

public class CutOffTreesForGolfEvent {

    private static final int[][] DIRS = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public int cutOffTree(List<List<Integer>> forest) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[2] - b[2]);
        for (int i = 0; i < forest.size(); i++) {
            for (int j = 0; j < forest.get(0).size(); j++) {
                if (forest.get(i).get(j) > 1) pq.offer(new int[]{i, j, forest.get(i).get(j)});
            }
        }

        int minSteps = 0;
        int[] source = new int[]{0, 0}; 
        while (!pq.isEmpty()) {
            int[] dest = pq.poll();
            int steps = shortestDistance(source, dest, forest);
            if (steps == -1) return -1;
            minSteps += steps;
            source = dest;
        }
        return minSteps;
    }

    private int shortestDistance(int[] source, int[] dest, List<List<Integer>> forest) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{source[0], source[1], 0});
        boolean[][] visited = new boolean[forest.size()][forest.get(0).size()];
        visited[source[0]][source[1]] = true;
        while (!queue.isEmpty()) {
            int[] entry = queue.poll();
            if (entry[0] == dest[0] && entry[1] == dest[1]) return entry[2];
            for (int[] dir : DIRS) {
                int row = entry[0] + dir[0], col = entry[1] + dir[1];
                boolean inbound = row >= 0 && row < forest.size() && col >= 0 && col < forest.get(0).size();
                if (inbound && !visited[row][col] && forest.get(row).get(col) != 0) {
                    visited[row][col] = true;
                    queue.offer(new int[]{row, col, entry[2] + 1});
                }
            }
        }
        return -1;
    }
}
