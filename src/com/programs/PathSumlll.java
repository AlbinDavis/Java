package com.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.programs.TreeBFS.BFS;
import static com.programs.TreeBFSTemplateForStoringLevel.BFSTemplate;

public class PathSumlll {
    static List<List<Integer>> paths = new ArrayList<>();
    static int count =0;
    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(1000000000);
        root.left = new TreeNode<>(1000000000);
        root.left.left = new TreeNode<>(294967296);
        root.left.left.left= new TreeNode<>(1000000000);
        root.left.left.left.left = new TreeNode<>(1000000000);
        root.left.left.left.left.left = new TreeNode<>(1000000000);
        helper(root,new ArrayList<>(),0);
        System.out.println(paths);
        System.out.println(count);
    }

    private static void helper(TreeNode<Integer> root, List<Integer> path,int target) {
        if(root == null)
            return;
        path.add(root.val);
        long sum=0;
        List<Integer> list =new ArrayList<>(path);
        for(int i=path.size()-1;i>=0;i--){
            sum += path.get(i);
            int j=i;
            if(sum==target) {
                paths.add(list.subList(j,path.size() ));count++;
            }

        }

        helper(root.left,path,target);
        helper(root.right,path,target);
        path.remove(path.size()-1);

    }
}
