package com.collection_framework.List_interface.Linkedlist;

import java.util.*;

public class queue {
    public static void main(String[] args) {
        LinkedList<String> q = new LinkedList<String>();
        q.add("Volvo");
        q.add("BMW");
        q.add("Ford");
        q.add("Mazda");
        System.out.println("values of queue\n"+q);
        System.out.println("size="+q.size());
        System.out.println("removing front :"+q.remove());
        System.out.println("Head of queue :"+q.peek());

    }
}
