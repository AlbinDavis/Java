package com.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderIterative {
    static List<Integer> result =  new ArrayList<>();
    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(1);
        root.left=new TreeNode<>(2,new TreeNode<>(4),new TreeNode<>(5));
        root.right = new TreeNode<>(3,new TreeNode<>(6),new TreeNode<>(7));
        Stack<TreeNode<Integer>> stack = new Stack<>();
        TreeNode<Integer> curr=root;
        while(curr !=null || !stack.isEmpty()){
            while(curr !=null){
              stack.push(curr);
              curr = curr.left;
            }
            curr=stack.pop();
            result.add(curr.val);
            curr=curr.right;
        } 
        System.out.println(result);
    }
}
