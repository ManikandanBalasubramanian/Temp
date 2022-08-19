package com.leetcode.easy;

import com.leetcode.utils.TreeNode;
import java.util.List;
import java.util.ArrayList;

public class BinaryTreeInOrderTraversal {

    List<Integer> list = new ArrayList<>();
    
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null) return list;
        inorderTraversal(root.left);
        list.add(root.val);
        inorderTraversal(root.right);

        return list;
    }
}