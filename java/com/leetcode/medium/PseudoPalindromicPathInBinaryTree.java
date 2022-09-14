package com.leetcode.medium;

public class PseudoPalindromicPathInBinaryTree {
    int[] freq = new int[10];
    
    public int pseudoPalindromicPaths (TreeNode root) {
        return helper(root, 0);
    }
    
    public int helper(TreeNode root, int len) {
        if(root == null) return freq[0];
                        
        freq[root.val] = freq[root.val] + 1;

        if(root != null && root.left == null && root.right == null) {
            check(len + 1);
        } else {
            helper(root.left, len+1);
            helper(root.right, len+1);
        }
        
        freq[root.val] = freq[root.val] - 1;
        
        return freq[0];
    }
    
    public int check(int len) {
        boolean allowed = ( (len&1) == 1);
        
        for(int i = 1 ; i < freq.length; i++) {

            if( (freq[i]&1) == 1 && allowed) {
                allowed = false;        
            } else if((freq[i]&1) == 1) {
                return freq[0];
            }
        }
        
        freq[0] = freq[0] + 1;
        return freq[0];
    }   
}