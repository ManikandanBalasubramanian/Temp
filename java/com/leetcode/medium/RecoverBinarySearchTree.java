package com.leetcode.medium;

import com.leetcode.utils.TreeNode;
import java.util.List;
import java.util.ArrayList;


public class RecoverBinarySearchTree {
	List<TreeNode> list = new ArrayList<>();
    
    public void recoverTree(TreeNode root) {
        constructAscendingList(root);

        if(list.size() <= 1) return;

        List<Integer> anomalyList = new ArrayList<>();

        int start = 0, end = list.size() - 1;
        boolean startBool = true, endBool = true;

        while( (start < end) && (startBool || endBool)){
            if(list.get(start).val < list.get(start + 1).val) {
                start++;
            } else {
                startBool = false;
            }

            if(list.get(end).val > list.get(end - 1).val) {
                end--;
            } else {
                endBool = false;
            }
        }
                
        int temp = list.get(start).val;
        list.get(start).val = list.get(end).val;
        list.get(end).val = temp;
                
    }
    
    public void constructAscendingList(TreeNode root) {
        if(root == null) return;
        constructAscendingList(root.left);
        list.add(root);
        constructAscendingList(root.right);
    }
}