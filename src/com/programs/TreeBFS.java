package com.programs;

import java.util.LinkedList;
import java.util.Queue;

//Also known as level order traversal.
public class TreeBFS {
    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(1);
        root.left=new TreeNode<>(2,new TreeNode<>(4),new TreeNode<>(5));
        root.right = new TreeNode<>(3,new TreeNode<>(6),new TreeNode<>(7));
        BFS(root);

    }
    public static void BFS(TreeNode<Integer> root){
        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode<Integer> curr = queue.poll();
            System.out.println(curr.val);
            if(curr.left != null)
                queue.add(curr.left);
            if(curr.right != null)
                queue.add(curr.right);
        }
    }

}
