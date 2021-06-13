package com.collection_framework.List_interface.set;
import java.util.*;
//stores in sorted manner
public class treeset {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(5);
        ts.add(4);
        ts.add(1);
        ts.add(5);
        ts.add(7);//will not have duplicate elements
        for (Integer h : ts)
            System.out.println(h);
        System.out.println("\n"+"lowest element="+ts.pollFirst());//lowest element
        System.out.println("highest element="+ts.pollLast());//highest element
    }
}
