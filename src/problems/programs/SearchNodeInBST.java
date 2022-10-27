package problems.programs;

import static problems.programs.TreeDFS.preOrder;

public class SearchNodeInBST {
    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(1);
        root.left=new TreeNode<>(2,new TreeNode<>(4),new TreeNode<>(5));
        root.right = new TreeNode<>(3,new TreeNode<>(6),new TreeNode<>(7));
        preOrder(searchNode(root,5));
    }

    private static TreeNode<Integer> searchNode(TreeNode<Integer> root, int val) {
        if(root == null || root.val == val)
            return root;
        TreeNode<Integer> right=null;
        if(val>root.val)
            right = (searchNode(root.right,val));
        return (right != null) ? right:searchNode(root.left,val);
    }
}
