package com.leetcode.medium;

import com.leetcode.utils.TreeNode;

public class AddOneRowToTree {

    boolean isLeft = true;
    
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        
        if(depth == 1) {
            TreeNode node = new TreeNode(val);
            if(isLeft) node.left = root;
            else node.right = root;
            
            return node;
        }
        
        if(root == null) return null;
        
        isLeft = true;
        root.left = addOneRow(root.left, val, depth -1);
        
        isLeft = false;
        root.right = addOneRow(root.right, val, depth -1);
        
        return root;
    }
}