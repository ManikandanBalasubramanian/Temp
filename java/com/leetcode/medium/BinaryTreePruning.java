package com.leetcode.medium;

import com.leetcode.utils.TreeNode;

public class BinaryTreePruning {

    public TreeNode pruneTree(TreeNode root) {
        
        if(!prune(root)) root = null;
        return root;
    }
    
    
    public boolean prune(TreeNode root) {
        if(root == null) return false;
        
        boolean current = root.val == 1;
        boolean left = prune(root.left);
        boolean right = prune(root.right);
        
        if(!left) root.left = null;
        if(!right) root.right = null;
        
        return (current || left || right);
    }

    
}