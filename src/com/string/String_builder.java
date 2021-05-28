package com.string;

public class String_builder {
    public static void main(String[] args) {
        StringBuilder sb =new StringBuilder("java");
        sb.append(" hello");
        System.out.println(sb);
        System.out.println(sb.reverse());
        StringBuilder sb1 =new StringBuilder("Hello java");
        sb1.delete(0,6);
        System.out.println(sb1);
        sb1.insert(2,"Hello");
        System.out.println(sb1);
        sb1.replace(2,9,"va");
        System.out.println(sb1.capacity());
    }
}
