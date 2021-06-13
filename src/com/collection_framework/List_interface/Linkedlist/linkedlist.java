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
        cars.addFirst("MARUTHI");
        cars.addLast(("HONDA"));

        System.out.println("\nAfter updating");
        System.out.println(cars);

        cars.removeFirst();
        cars.removeLast();
        System.out.println("\nAfter removing\n"+cars);
        System.out.println("\nAfter reversing");
        Iterator<String> j = cars.descendingIterator();
        while(j.hasNext())
            System.out.println(j.next());
    }
}
