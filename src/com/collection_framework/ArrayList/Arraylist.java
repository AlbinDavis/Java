package com.collection_framework.ArrayList;
import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println("size if list=" + cars.size());
        System.out.println(cars);
        System.out.println(cars.get(0));
        System.out.println("\nUsing for each loop\n");
        for (String i : cars)
            System.out.println(i);
        cars.remove("Ford");
        System.out.println("\nUsing iterator\n");
        Iterator<String> i = cars.iterator();
        while(i.hasNext())
            System.out.println(i.next());
cars.clear();
        System.out.println("\nafter clearing\n"+cars);
    }


}