package com.leetcode.easy;

import com.leetcode.utils.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreOrderTraversal {

    List<Integer> list = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null) return list;
        list.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return list;
    }
}