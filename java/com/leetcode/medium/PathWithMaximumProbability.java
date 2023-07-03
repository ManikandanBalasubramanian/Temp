package com.leetcode.medium;

public class PathWithMaximumProbability {

    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {

        // build graph -> double[0]: node, double[1]: edge prob
        Map<Integer, List<double[]>> graph = new HashMap<>();
        for (int i = 0; i < edges.length; ++i) {
            int[] edge = edges[i];
            graph.putIfAbsent(edge[0], new ArrayList<>());
            graph.putIfAbsent(edge[1], new ArrayList<>());

            graph.get(edge[0]).add(new double[] { edge[1], succProb[i] });
            graph.get(edge[1]).add(new double[] { edge[0], succProb[i] });
        }

        double[] visited = new double[n]; // best prob so far for each node
        visited[start] = 1.0;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);

        while (!queue.isEmpty()) {
            int parent = queue.poll();
            if (!graph.containsKey(parent)) {
                continue;
            }
            for (double[] child : graph.get(parent)) {
                // add to queue only if: it can make a better prob
                int childName = (int) child[0];
                double prob = visited[parent] * child[1];
                if (visited[childName] >= prob)
                    continue;
                queue.offer(childName);
                visited[childName] = prob;
            }
        }
        return visited[end];
    }
}