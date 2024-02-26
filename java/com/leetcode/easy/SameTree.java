package com.leetcode.easy;

public class SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if ((p != null && q != null) && (p.val == q.val)) {
            boolean left = isSameTree(p.left, q.left);
            boolean right = isSameTree(p.right, q.right);
            return left && right;

        } else if ((p == null && q != null) || (p != null && q == null)) {
            return false;
        } else if (p == null && q == null) {
            return true;
        } else {
            return false;
        }
    }
}