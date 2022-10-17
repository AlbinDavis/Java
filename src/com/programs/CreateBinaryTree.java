package com.programs;

import java.util.List;

public class CreateBinaryTree{
     static TreeNode<Integer> createTree(List<Integer> list, int index) {
        TreeNode<Integer> root = null;
        if (index < list.size() && list.get(index)!=null) {
            root = new TreeNode<>(list.get(index));
            if(root.val != null) {
                root.left = createTree(list, index * 2 + 1);
                root.right = createTree(list, index * 2 + 2);
            }
        }
        return root;
    }
}
