package com.programs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightViewOfTree {
    static List<Integer> result = new ArrayList<>();
    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(1);
        root.left = new TreeNode<>(2, new TreeNode<>(4), new TreeNode<>(5));
        root.right = new TreeNode<>(3, new TreeNode<>(6), new TreeNode<>(7));
        helper(root,0);
        System.out.println(result);
    }
    public static void helper(TreeNode<Integer> root, int curr){
        if(root == null)
            return;
        if(result.size()==curr)
            result.add(root.val);

        helper(root.right,curr+1);
        helper(root.left,curr+1);

    }
            //BFS
//        TreeNode<Integer> root = new TreeNode<>(1);
//        root.left = new TreeNode<>(2, new TreeNode<>(4), new TreeNode<>(5));
//        root.right = new TreeNode<>(3, new TreeNode<>(6), new TreeNode<>(7));
////                    (1)
////                   /   \
////                 /       \
////               (2)       (3)
////              /   \     /   \
////            (4)   (5) (6)   (7)
//
//        Queue<TreeNode<Integer>> q = new LinkedList<>();
//        List<Integer> list = new ArrayList<>();
//        q.add(root);
//        while(!q.isEmpty()){
//            int s = q.size();
//            while(s -->0){
//                TreeNode<Integer> curr = q.poll();
//                if(s ==0 ) {
//                    list.add(curr.val);
//                }
//                if(curr.left != null)
//                    q.add(curr.left);
//                if(curr.right != null)
//                    q.add(curr.right);
//            }
//        }

}
