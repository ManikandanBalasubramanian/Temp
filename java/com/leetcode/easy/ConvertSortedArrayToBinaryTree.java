package com.leetcode.easy;

import com.leetcode.utils.TreeNode;

public class ConvertSortedArrayToBinaryTree {

    public TreeNode sortedArrayToBST(int[] nums) {
        int i = 0;
        int mid = nums.length/2;
        
        TreeNode root = new TreeNode(nums[mid]);
        root.left = (sorted(nums, 0, mid-1));
        root.right = (sorted(nums, mid+1, nums.length-1));                
        
        
        return root;
    }
    
    public TreeNode sorted(int[] nums, int start, int end) {
        if(end < start) return null;
        
        int mid = (start + end)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = (sorted(nums, start, mid-1));
        root.right = (sorted(nums, mid+1, end));
        return root;
    }

    
}