package problems.programs;

import java.util.*;
import java.util.LinkedList;
// It will not work for leetcode because we have to sort on the basis of the depth(vd) there.
// for that extra sorting part should be added.
public class VerticalTreeTraversalBFS {
    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(1);
        root.left=new TreeNode<>(2,new TreeNode<>(4),new TreeNode<>(6));
        root.right = new TreeNode<>(3,new TreeNode<>(5),new TreeNode<>(7));

        TreeMap<Integer,List<Integer>> resultMap = new TreeMap<>();
        Queue<Map<TreeNode<Integer>,Integer>> queue = new LinkedList<>();
        queue.add(Collections.singletonMap(root,0));
        while(!queue.isEmpty()){
            Map<TreeNode<Integer>, Integer> map = queue.poll();
            map.forEach((x,y)->{
                if(!resultMap.containsKey(y))
                    resultMap.put(y,new ArrayList<>(Collections.singletonList(x.val)));
                else
                    resultMap.get(y).add(x.val);
                if(x.left!=null)
                    queue.add(Collections.singletonMap(x.left, y - 1));

                if (x.right != null)
                    queue.add(Collections.singletonMap(x.right, y + 1));
            });
        }
        List<List<Integer>> result = new ArrayList<>(resultMap.values());
        System.out.println(result);
    }
}
