package problems.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class AllElementsTwoBST {
    public static void main(String[] args) {
        TreeNode<Integer> root1 = new TreeNode<>(7),root2=new TreeNode<>(8);
        root1.left=new TreeNode<>(4,new TreeNode<>(2),new TreeNode<>(3));
        root1.right = new TreeNode<>(5);

        List<Integer> result = new ArrayList<>();
        Stack<TreeNode<Integer>> stack1 = new Stack<>(),stack2=new Stack<>();
        TreeNode<Integer> curr1 = root1,curr2 =root2;
        while(!stack1.isEmpty() || !stack2.isEmpty()|| curr1!=null|| curr2!=null){
            while(curr1 != null){
                stack1.push(curr1);
                curr1 = curr1.left;
            }
            while(curr2 != null){
                stack2.push(curr2);
                curr2 = curr2.left;
            }
            if(stack2.isEmpty() || (!stack1.isEmpty() && stack1.peek().val<=stack2.peek().val)){
                curr1 = stack1.pop();
                result.add(curr1.val);
                curr1 = curr1.right;
            }
            else{
                curr2 = stack2.pop();
                result.add(curr2.val);
                curr2 = curr2.right;
            }

        }
        System.out.println(result);
    }
}
