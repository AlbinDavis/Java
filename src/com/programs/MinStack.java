package com.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//public static void main(String[] args) {
//
//        MinStack minStack = new MinStack();
//        minStack.push(512);
//        minStack.push(-1024);
//        minStack.push(-1024);
//        minStack.push(512);
//
//// return -3
//        minStack.pop();
//        System.out.println(minStack.getMin());// return -3
//        minStack.pop();
//        System.out.println(minStack.getMin());// return -3
//        minStack.pop();
//        System.out.println(minStack.getMin());// return -3
//
//        }
class MinStack {
    List<Integer> stack = new ArrayList<>();
    List<Integer> minStack = new ArrayList<>();
    int min=Integer.MAX_VALUE;
    public MinStack() {
    }

    public void push(int val) {

        stack.add(val);
        if(minStack.size()==0)
            minStack.add(val);
        else {
            int peek = minStack.get(minStack.size() - 1);
            if (val <= peek)
                minStack.add(val);
        }

    }

    public void pop() {
        if(minStack.size() > 0){
//            int val1=minStack.get(minStack.size()-1);
//            int val2=stack.get(stack.size()-1);
                if(Objects.equals(minStack.get(minStack.size() - 1), stack.get(stack.size() - 1))){
            minStack.remove(minStack.size()-1);}}
        System.out.println(minStack.get(minStack.size()-1) + " " +stack.get(stack.size()-1));
        if(stack.size()>0)
            stack.remove(stack.size()-1);

    }

    public int top() {
        if(stack.size()>0)
            return stack.get(stack.size()-1);
        else
            return -1;
    }

    public int getMin() {
        if(minStack.size()>0)
            return minStack.get(minStack.size()-1);
        else
            return -1;
    }
}