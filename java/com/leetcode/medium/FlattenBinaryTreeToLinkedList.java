package com.leetcode.medium;

import com.leetcode.utils.TreeNode;
import java.util.List;
import java.util.ArrayList;

public class FlattenBinaryTreeToLinkedList {
    List<TreeNode> list = new ArrayList<>();
    
    public void flatten(TreeNode root) {
        process(root);
        
        if (list.size() > 0) {
            root = list.get(0);
        } else {
        root = null;
        }
        
        for(int i = 1; i < list.size(); i++ ) {
            root.right = list.get(i);
            root.left = null;
            root = root.right;
        }
        
            }
    
    public void process(TreeNode node) {
        
        if(node != null) {
            list.add(node);
            process(node.left);
            process(node.right);
        }
    }
    
}