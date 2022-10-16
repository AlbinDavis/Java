package com.programs;

import java.util.ArrayList;
import java.util.Arrays;

import static com.programs.TreeDFS.preOrder;

public class InsertIntoBST {
    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(7);
        root.left = new TreeNode<>(4, new TreeNode<>(2), new TreeNode<>(5));
        root.right = new TreeNode<>(8);
        preOrder(helper(root,9));
    }
    private static TreeNode<Integer> helper(TreeNode<Integer> root, int val) {
        if(root == null)
            return new TreeNode<>(val);
        if(val < root.val)
            root.left = helper(root.left,val);
        else
            root.right = helper(root.right,val);
        return root;
    }
}
