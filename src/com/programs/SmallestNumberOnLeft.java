package com.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SmallestNumberOnLeft {
    public static void main(String[] args) {
        int[] arr= {-1, 19, 19 ,19 ,19, 19 ,19};
        Stack<Integer> stack = new Stack<>();
        List<Integer> list=new ArrayList<>();
        stack.push(-1);
        for(int i:arr){
            while(stack.peek()>=i && stack.peek()!=-1)
                stack.pop();
            list.add(stack.peek());
            stack.push(i);
        }
        System.out.println(list);
    }
}
