package com.collection_framework.ArrayList;

import java.util.*;


public class sorting_arraylist_elements {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<Integer>();
        li.add(5);
        li.add(3);
        li.add(6);
        li.add(1);
        System.out.println("Before sorting");
        for(Integer i :li)
            System.out.println(i);
        System.out.println("After sorting");
        Collections.sort(li);
        for(Integer i :li)
            System.out.println(i);
    }

}
