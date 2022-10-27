package problems.programs;

public class IsValidBST {
     static TreeNode<Integer> prev = null;
    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(1);
        root.left = new TreeNode<>(1);
        System.out.println(helper(root));
    }
    public static boolean helper(TreeNode<Integer> root){
        if(root == null)
            return true;
        if(!helper(root.left))
            return false;
        if(prev!=null && root.val <= prev.val) {
            return false;
        }
        prev=root;
        return helper(root.right);

    }
}
