package com.programs;

import java.util.Stack;

public class EvaluateReversePolishNotation {
    public static void main(String[] args) {
        String[] tokens= {"4", "13", "5", "/", "+"};
        Stack<String>stack=new Stack<>();

        for(String token:tokens){
            if(token.equals("*") || token.equals("/") || token.equals("+") || token.equals("-")){
                int val1=Integer.parseInt(stack.pop());
                int val2=Integer.parseInt(stack.pop());
                if(token.equals("+"))
                    stack.push(String.valueOf(val1+val2));
                else if(token.equals("-"))
                    stack.push(String.valueOf(val1-val2));
                else if(token.equals("/"))
                    stack.push(String.valueOf(val2/val1));
                else
                    stack.push(String.valueOf(val1*val2));
            }
            else
                stack.add(token);
        }
        System.out.println(stack.peek());
    }
}
