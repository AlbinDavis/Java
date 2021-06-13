package com.collection_framework.map_interface;
import java.util.*;
public class tree_map {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm = new TreeMap<>();
        tm.put(5,"covaxin");
        tm.put(4,"pfizer");
        tm.put(1,"covishield");
        tm.put(3,"sputnik");
        tm.put(7,"moderna");
        System.out.println(tm);
        for(Map.Entry m:tm.entrySet())
            System.out.println(m.getKey()+" "+m.getValue());

    }
}
