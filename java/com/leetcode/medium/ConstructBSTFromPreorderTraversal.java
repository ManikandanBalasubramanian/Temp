package com.leetcode.medium;

import com.leetcode.utils.TreeNode;

public class ConstructBSTFromPreorderTraversal {

	int i = 0;
    public TreeNode bstFromPreorder(int[] preorder) {
          return helper(preorder, Integer.MAX_VALUE);
    }

    public TreeNode helper(int[] arr, int bound) {
        if (i == arr.length || arr[i] > bound) return null;
        TreeNode root = new TreeNode(arr[i++]);
        root.left = helper(arr, root.val);
        root.right = helper(arr, bound);
        return root;
    }
}