package problems.programs;

import static problems.programs.TreeDFS.preOrder;

public class InvertBinaryTree {
    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(1);
        root.left=new TreeNode<>(2,new TreeNode<>(4),new TreeNode<>(5));
        root.right = new TreeNode<>(3,new TreeNode<>(6),new TreeNode<>(7));
        TreeNode<Integer> invertedNode = invertTree(root);
        preOrder(invertedNode);
        SearchNodeInBST searchNodeInBST = new SearchNodeInBST();
    }

    private static TreeNode<Integer> invertTree(TreeNode<Integer> root) {
        if(root == null)
            return null;
        TreeNode<Integer> left = invertTree(root.left);
        TreeNode<Integer> right = invertTree(root.right);

        root.left=right;
        root.right = left;

        return root;
    }
}
