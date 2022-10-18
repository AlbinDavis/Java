package com.programs;

public class TreePathSum {
    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(1);
        root.right=new TreeNode<>(2);
        System.out.println(pathSum(root,3));
    }
    private static boolean pathSum(TreeNode<Integer> root,int sum){
        if(root == null)
            return false;
        if(root.left == null && root.right == null && sum- root.val == 0)
            return true;
        if(!pathSum(root.left,sum-root.val))
            return pathSum(root.right, sum-root.val);
        else
            return true;
    }
}
