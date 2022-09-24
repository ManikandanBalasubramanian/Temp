package com.leetcode.medium;

import java.util.List;
import java.util.ArrayList;

public class PathSumII {

    public List<List<Integer>> pathSum(TreeNode root, int target) {
        List<List<Integer>> results = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(root, 0, target, path, results);
        return results;
    }

    public void dfs(TreeNode node, int sum, int target, List<Integer> path, List<List<Integer>> results) {
        if (node == null) return;
        sum += node.val;

        path.add(node.val);

        if(node.left == null && node.right == null && sum == target) {
            results.add(new ArrayList(path));
            return;
        }

        if (node.left != null) {
            dfs(node.left, sum, target, path, results);
            path.remove(path.size()-1);
        }

        if(node.right != null) {
            dfs(node.right, sum, target, path, results);
            path.remove(path.size()-1);
        }
    }
}