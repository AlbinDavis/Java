package problems.programs;

import java.util.*;
import java.util.LinkedList;

public class MaxWidthOfBinaryTree {
    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(1);
        root.left=new TreeNode<>(3);
        root.right = new TreeNode<>(2);
        root.left.left = new TreeNode<>(5);

        Queue<List<?>> queue = new LinkedList<>();
        queue.add(new ArrayList<>(Arrays.asList(root,0)));
        int first =0,last =0;
        int length = 1;
        while(!queue.isEmpty()){
            int size = queue.size();
            int min = (int) queue.peek().get(1);
            for(int i=0;i<size;i++){
                List<?> list=  queue.poll();
                TreeNode curr = (TreeNode) list.get(0);
                int value = (int) list.get(1);

                if(i==0) first = value;
                if(i==size-1) last = value;

                if(curr.left != null)
                    queue.add(new ArrayList<>(Arrays.asList(curr.left,(value-min)*2+1)));
                if(curr.right != null)
                    queue.add(new ArrayList<>(Arrays.asList(curr.right,(value-min)*2+2)));
            }

            length = Math.max(length,last-first+1);
        }
        System.out.println(length);
    }
}


//package problems.programs;
//
//import com.sun.source.tree.Tree;
//
//import java.util.*;
//import java.util.LinkedList;
//
//public class MaxWidthOfBinaryTree {
//    public static void main(String[] args) {
//        TreeNode<Integer> root = new TreeNode<>(1);
//        root.left=new TreeNode<>(3);
//        root.right = new TreeNode<>(2);
//        root.left.left = new TreeNode<>(5);
//        Queue<List<?>> queue = new LinkedList<>();
//        queue.add(new ArrayList<>(Arrays.asList(root,0)));
//        int min = 0;
//        int index =0;
//        int length = 1;
//        while(!queue.isEmpty()){
//            int size = queue.size();
//            int min1 = Integer.MAX_VALUE;
//            boolean flag = false;
//            while(size --> 0){
//                List<?> list=  queue.poll();
//                TreeNode curr = (TreeNode) list.get(0);
//
//                int value = (int) list.get(1);
//
//                if(curr.left != null){
//                    flag = true;
//                    index = (value-min)*2+1;
//                    queue.add(new ArrayList<>(Arrays.asList(curr.left,index)));
//                    min1 = Math.min(min1,index);
//                }
//
//                if(curr.right != null){
//                    flag = true;
//                    index = (value-min)*2+2;
//                    queue.add(new ArrayList<>(Arrays.asList(curr.right,index)));
//                    min1 = Math.min(min1,index);
//                }
//            }
//            min = min1;
//            if(flag)
//                length = Math.max(length,index-min1+1);
//        }
//        System.out.println(length);
//    }
//}
