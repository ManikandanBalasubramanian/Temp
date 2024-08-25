package com.leetcode.easy;

import com.leetcode.utils.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostOrderTraversal {

    List<Integer> list = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        if(root == null) return list;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        list.add(root.val);
        return list;
    }
}