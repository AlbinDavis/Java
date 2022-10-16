package com.programs;

import java.util.Stack;

public class BaseBallGame {
    public static void main(String[] args) {
        String [] operations = {"1","C"};
        Stack<Integer> stack = new Stack<>();
        int sum=0;
        for(String i: operations){
            if(i.equals("C")) {
                if (stack.size() > 0)
                    sum -= stack.pop();
            }
                else if(i.equals("D")){
                    if(stack.size()>0){
                        stack.push(stack.peek()*2);
                        sum+=stack.peek();}
                }
                else if(i.equals("+")){
                    if(stack.size()>=2){
                        int val = stack.pop();
                        int s = val+stack.peek();
                        stack.push(val);
                        stack.push(s);
                        sum+=stack.peek();
                    }}
                else{
                    stack.push(Integer.valueOf(i));
                    sum+=stack.peek();
                    System.out.println(stack);
                }

        }
        System.out.println(stack);
        System.out.println(sum);
    }
}
