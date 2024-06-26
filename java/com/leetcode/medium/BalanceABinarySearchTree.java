package com.leetcode.medium;

public class BalanceABinarySearchTree {
    
    private List<Integer> nodeList = new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
        populateList(root);
        TreeNode newRoot = balanceBSTHelper(0, nodeList.size() - 1);
        return newRoot;
    }
    private TreeNode balanceBSTHelper(int startIndx, int endIndx){
        if(startIndx > endIndx){
            return null;
        }
        if(startIndx == endIndx){
            return new TreeNode(nodeList.get(startIndx));
        }
        int midIndx = startIndx + (endIndx - startIndx) / 2;
        TreeNode currRoot = new TreeNode(nodeList.get(midIndx));
        currRoot.left = balanceBSTHelper(startIndx, midIndx - 1);
        currRoot.right = balanceBSTHelper(midIndx + 1, endIndx);
        return currRoot;

    }
    private void populateList(TreeNode root){
        if(root == null)return;
        populateList(root.left);
        nodeList.add(root.val);
        populateList(root.right);
    }
}