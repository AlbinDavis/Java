package com.collection_framework.map_interface;
import java.util.*;
public class tree_map {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(5,"covaxin");
        hm.put(4,"pfizer");
        hm.put(1,"covishield");
        hm.put(5,"sputnik");
        hm.put(7,"moderna");
        System.out.println(hm);
        for(Map.Entry m:hm.entrySet())
            System.out.println(m.getKey()+" "+m.getValue());
    }
}
