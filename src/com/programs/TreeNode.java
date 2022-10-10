package com.programs;

public class TreeNode<U> {
    U val;
    TreeNode<U> left;
    TreeNode<U> right;
    TreeNode(U val, TreeNode<U> left, TreeNode<U> right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
    TreeNode(){}
    TreeNode(U val){
        this.val = val;
    }
}
