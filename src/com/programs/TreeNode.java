package com.programs;

public class TreeNode<U> {
    U data;
    TreeNode left;
    TreeNode right;
    TreeNode(U data,TreeNode left,TreeNode right){
        this.data = data;
        this.left = left;
        this.right = right;
    }
    TreeNode(){};
    TreeNode(U data){
        this.data = data;
    }
}
