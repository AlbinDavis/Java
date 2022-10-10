package com.programs;

public class TreeDFS {
    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(1);
        root.right = new TreeNode<>(2);
        root.right.left = new TreeNode<>(3);
        preOrder(root);
        System.out.println("***************************************");
        inOrder(root);
        System.out.println("***************************************");
        postOrder(root);

    }
    static <U> void preOrder(TreeNode<U> root){
        if(root==null)
            return;
        System.out.println(root.val);
        preOrder(root.left);
        preOrder(root.right);

    }
    static <U> void inOrder(TreeNode<U> root){
        if(root==null)
            return;

        inOrder(root.left);
        System.out.println(root.val);
        inOrder(root.right);

    }
    static <U> void postOrder(TreeNode<U> root){
        if(root==null)
            return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.val);

    }
}
