package com.leetcode.medium;

import com.leetcode.utils.TreeNode;
import java.util.List;
import java.util.ArrayList;
import java.util.TreeMap;

class BinaryTreeZigZagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        TreeMap<Integer, List<Integer>> map = new TreeMap<>();
        goDFS(0, root, map);

        List<List<Integer>> list = new ArrayList<>();
        for (int key : map.keySet()) {
            if (key % 2 == 1) Collections.reverse(map.get(key));
            list.add(map.get(key));
        }
        
        return list;
    }

    private void goDFS(int lvl, TreeNode node, TreeMap<Integer, List<Integer>> map) {
        if (node == null) return;

        List<Integer> list = map.computeIfAbsent(lvl, k -> new ArrayList<>());
        list.add(node.val);
        lvl++;
        goDFS(lvl, node.left, map);
        goDFS(lvl, node.right, map);
    }
}