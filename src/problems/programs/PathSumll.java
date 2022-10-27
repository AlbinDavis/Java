package problems.programs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PathSumll {
    static List<List<Integer>> result = new ArrayList<>();
    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(1);
        root.right=new TreeNode<>(2);
        root.left= new TreeNode<>(1);
        root.left.left = new TreeNode<>(1);
        //root.left.right = new TreeNode<>(1);
        pathSum(root,3,new LinkedList<>());
        System.out.println(result);
    }
    private static void pathSum(TreeNode<Integer> root,int sum,LinkedList<Integer> list){
        if(root == null)
            return;
        list.add(root.val);
        if(root.left == null && root.right == null && sum- root.val == 0){
            result.add(new ArrayList<>(list));
        }
        pathSum(root.left,sum-root.val,list);
        pathSum(root.right, sum-root.val,list);
        list.removeLast();

    }
}
