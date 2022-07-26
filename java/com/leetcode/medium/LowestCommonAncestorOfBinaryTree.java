package com.leetcode.medium;

import com.leetcode.utils.TreeNode;

public class LowestCommonAncestorOfBinaryTree {

    TreeNode out = null;
    boolean pBool = false;
    boolean qBool = false;
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {        
        LCA(root, p, q);
        return out;
    }
    
    public void LCA(TreeNode root, TreeNode p, TreeNode q) {
        
        boolean above = (pBool || qBool);

        if (root == null) return;
        
        if(p == root && qBool) {
            pBool = true;
            return;
        } else if(p == root) {
            pBool = true;
        }
        
        if(q == root && pBool) {
            qBool = true;
            return;
        } else if( q == root) {
            qBool = true;
        }
                
        LCA(root.left, p, q);      
        LCA(root.right, p ,q);
        
        if(!above && pBool && qBool) {
            out = root;
            pBool = false;
            qBool = false;
            return;
        }
        
    }
}