package com.leetcode.easy;

import com.leetcode.utils.TreeNode;

public class SumOfLeftLeaves {

    public int sumOfLeftLeaves(TreeNode root) {
       return sumLeft(root, false);
    }
    
    public int sumLeft(TreeNode root, boolean isLeft) {
        if(root == null) return 0;
        
        if(root.left == null && root.right == null && isLeft) return root.val;

        return sumLeft(root.left, true) + sumLeft(root.right, false);
    }
}