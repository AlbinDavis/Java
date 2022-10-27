package problems.programs;

public class TreeMaxDepth {
    public static int left,right;
    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(1);
        TreeNode<Integer> node=new TreeNode<>(2);
        node.left=new TreeNode(4);
        root.left=node;
        root.right= new TreeNode(3);
        System.out.println(maxDepth(root));
    }

    public static int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        int left=maxDepth(root.left);
        int right = maxDepth(root.right);
        return 1+Math.max(left,right);
    }

}
