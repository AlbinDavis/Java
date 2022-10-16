package com.programs;

import java.util.*;
import java.util.LinkedList;

public class TreeBFSTemplateForStoringLevel {
    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(1);
        root.left = new TreeNode<>(2, new TreeNode<>(4), new TreeNode<>(5));
        root.right = new TreeNode<>(3, new TreeNode<>(6), new TreeNode<>(7));
        BFSTemplate(root);
    }

    private static void BFSTemplate(TreeNode<Integer> root) {
        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);
        List<Deque<Object>> result = new ArrayList<>();
        while (!queue.isEmpty()) {
            int len = queue.size();
            Deque<Object> deque = new LinkedList<>();
            //first check condition and then decreases
            while (len-- > 0) {
                TreeNode<Integer> node = queue.poll();
                deque.add(node.val);
                if (node.right != null)
                    queue.add(node.right);
                if (node.left != null)
                    queue.add(node.left);
            }
            result.add(deque);
        }
        System.out.println(result);
    }
}
