package com.leetcode.medium;

import com.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeRightSideView {

	public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        rec(root, list, 0);
        return list;
    }
    
    public boolean rec(TreeNode head, List<Integer> list, int depth) {
        
        if(head != null) {
            if(list.size() == depth) {
                list.add(head.val);
            } 
            rec(head.right, list, depth + 1);
            rec(head.left, list, depth + 1);
        } 
            
        return false;
    }
    

}