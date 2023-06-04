package com.leetcode.medium;

public class NumberOfProvinces {

    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;

        QuickFind w = new QuickFind(n);

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (i != j && isConnected[i][j] == 1) {
                    w.union(i, j);
                }
            }
        }

        return w.uniqueTrees().size();
    }

}

public class QuickFind {

    private int[] id;

    public QuickFind(int N) {
        id = new int[N];

        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    public Set<Integer> uniqueTrees() {
        Set<Integer> set = new HashSet<>();

        for (int i : id) {
            set.add(i);
        }

        return set;
    }

    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pid) {
                id[i] = qid;
            }
        }
    }

}