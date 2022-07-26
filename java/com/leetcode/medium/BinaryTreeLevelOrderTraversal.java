package com.leetcode.medium;

import java.util.List;
import java.util.ArrayList;
import com.leetcode.utils.TreeNode;

public class BinaryTreeLevelOrderTraversal {

    List<List<Integer>> out = new ArrayList<>();
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        recurse(root, 0);
        return out;
    }
    
    
    public void recurse(TreeNode node, int levelIdx) {
        if (node != null) {
            
            if(out.size() <= levelIdx) {
                out.add(new ArrayList<>());
                out.get(levelIdx).add(node.val);
            } else{
                out.get(levelIdx).add(node.val);
            }
            
            recurse(node.left, levelIdx + 1);
            recurse(node.right, levelIdx + 1);
        }
    }
}