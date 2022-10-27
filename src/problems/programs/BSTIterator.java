package problems.programs;

import java.util.Stack;

public class BSTIterator {
    Stack<TreeNode<Integer>> stack = new Stack<>();
    public BSTIterator(TreeNode<Integer> root) {
        addLeftNodes(root);
    }

    public int next() {
        TreeNode<Integer> curr=stack.pop();
        addLeftNodes(curr.right);
        return curr.val;
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }

    public void addLeftNodes(TreeNode<Integer> root){
        while(root!=null){
            stack.push(root);
            root = root.left;
        }
    }
}
class Iter{
    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(7);
        root.left=new TreeNode<>(4,new TreeNode<>(2),new TreeNode<>(3));
        root.right = new TreeNode<>(5);
        BSTIterator bstIterator = new BSTIterator(root);
        while(bstIterator.hasNext())
            System.out.println(bstIterator.next());
    }
}