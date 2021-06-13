package com.collection_framework.set_interface;
import java.util.*;
public class hashset {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Volvo");
        hs.add("BMW");
        hs.add("Ford");
        hs.add("Mazda");
        hs.add("Mazda");//will not allow duplicate elements
        for (String h : hs)
            System.out.println(h);
    }
}
