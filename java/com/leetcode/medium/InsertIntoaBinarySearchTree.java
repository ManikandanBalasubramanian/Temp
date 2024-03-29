package com.leetcode.medium;

import com.leetcode.utils.TreeNode;

public class InsertIntoaBinarySearchTree {

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        
        if (root.val < val) {
            root.right = insertIntoBST(root.right, val);                       
        } else {
            root.left = insertIntoBST(root.left, val);
        }
        return root;
    }
}