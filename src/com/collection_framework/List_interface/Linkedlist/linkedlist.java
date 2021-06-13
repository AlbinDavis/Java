package com.collection_framework.List_interface.Linkedlist;

import java.util.*;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println("Total no of elements in list="+ cars.size());
        Iterator<String> i = cars.iterator();
        while(i.hasNext())
            System.out.println(i.next());
    }
}
