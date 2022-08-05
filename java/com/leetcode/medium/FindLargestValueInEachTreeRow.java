package com.leetcode.medium;

import com.leetcode.utils.TreeNode;

import java.util.List;
import java.util.ArrayList;

public class FindLargestValueInEachTreeRow {

    List<Integer> list = new ArrayList<>();
    
    public List<Integer> largestValues(TreeNode root) {
        solve(root, 0);
        return list;
    }
    
    public void solve(TreeNode root, int level) {
        if(root == null) return;
        
        if(list.size() <= level) {
            list.add(root.val);
        } else {
            int max = Math.max(list.get(level) , root.val);
            list.set(level, max);
        }
        
        solve(root.left, level + 1);
        solve(root.right, level + 1);
    }
}