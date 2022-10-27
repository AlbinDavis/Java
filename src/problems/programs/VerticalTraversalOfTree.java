package problems.programs;

import java.util.*;

public class VerticalTraversalOfTree {
    static Map<Integer, Map<Integer,List<Integer>>> map = new TreeMap<>();
    //Map<Index,Map<depth,List<values>>
    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(1);
        root.left=new TreeNode<>(2,new TreeNode<>(4),new TreeNode<>(6));
        root.right = new TreeNode<>(3,new TreeNode<>(5),new TreeNode<>(7));
        helper(root,0,0);
        List<List<Integer>> result = new ArrayList<>();
        map.forEach((x, y)->{
            List<Integer> list = new ArrayList<>();
            y.forEach((p,q)->
            {
                Collections.sort(q);
                list.addAll(q);
            });
            result.add(list);
            });
        System.out.println(result);
    }
    private static void helper(TreeNode<Integer> root,int index,int depth){
        if(root==null)
            return;
        if(!map.containsKey(index))
            map.put(index,new TreeMap<>());
        if(!map.get(index).containsKey(depth))
            map.get(index).put(depth,new ArrayList<>());
        map.get(index).get(depth).add(root.val);
        helper(root.left,index-1,depth+1);
        helper(root.right,index+1,depth+1);
    }
}
