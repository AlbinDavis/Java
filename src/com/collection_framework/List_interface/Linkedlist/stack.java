package com.collection_framework.List_interface.Linkedlist;

import java.util.*;

public class stack {
    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<>();
        for(int i=0;i<=5;i++) {
            stack.addFirst(i);
        }
        System.out.println("values of stack\n"+stack);
        System.out.println("size="+stack.size());
        System.out.println("removing:"+stack.remove());
        System.out.println("values of stack\n"+stack);
        System.out.println("Head of stack :"+stack.peek());

    }
}
