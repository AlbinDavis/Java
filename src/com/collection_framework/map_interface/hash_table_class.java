package com.collection_framework.map_interface;

import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;
//The order is not maintained
public class hash_table_class {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht = new Hashtable<>();
        ht.put(5,"covaxin");
        ht.put(4,"pfizer");
        ht.put(1,"covishield");
        ht.put(3,"sputnik");
        ht.put(7,"moderna");
        System.out.println(ht);
        for(Map.Entry m:ht.entrySet())
            System.out.println(m.getKey()+" "+m.getValue());

    }
}
