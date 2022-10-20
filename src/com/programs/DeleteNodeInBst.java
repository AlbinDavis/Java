package com.programs;

import static com.programs.TreeDFS.preOrder;
//We have to consider 3 cases
//1. Has no child
//      we can directly delete the child because it's the leaf node
//2. Has one Child
//      We make it as the child of its grandparent
//3. Has two children
//      1.We have to find the smallest value in the right subtree of that node.
//      2.We will make node value as that value.
//      3.We delete the min value node at the right subtree or max value from the left subtree

public class DeleteNodeInBst {
    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(7);
        root.left=new TreeNode<>(4,new TreeNode<>(2),new TreeNode<>(5));
        root.right = new TreeNode<>(8,null,new TreeNode<>(9));

        preOrder(deleteNode(root,4));

    }
    private static TreeNode<Integer> deleteNode(TreeNode<Integer> root, int val) {
        if (root != null) {
            if (val < root.val)
                root.left = deleteNode(root.left, val);
            else if (val > root.val)
                root.right = deleteNode(root.right, val);
            else {
                //Implementing 3 conditions
                //1. No Children
                if (root.left == null && root.right == null)
                    return null;
                //2. One child
                if (root.left == null || root.right == null)
                    return (root.left == null) ? root.right : root.left;
                //3. Two children
                else {
                    //Replacing smallest from the Right subtree.
                    TreeNode<Integer> temp = root.right;
                    while (temp.left != null)
                        temp = temp.left;
                    root.val = temp.val;
                    root.right = deleteNode(root.right, temp.val);
                    //We can also replace with the biggest from the left subtree.
                        //TreeNode temp = root.left;
                        //while (temp.right != null)
                        //  temp = temp.right;
                        //root.val = temp.val;
                        // root.left = deleteNode(root.left, temp.val);
                }
            }
        }
        return root;
    }
}
