package com.string;

public class String_buffer {
    public static void main(String[] args) {
        StringBuffer sb =new StringBuffer("java");
        sb.append(" hello");
        System.out.println(sb);
        System.out.println(sb.reverse());
        StringBuffer sb1 =new StringBuffer("Hello java");
        sb1.delete(0,6);
        System.out.println(sb1);
        sb1.insert(2,"Hello");
        System.out.println(sb1);
        sb1.replace(2,9,"va");
        System.out.println(sb1.capacity());
    }
}
