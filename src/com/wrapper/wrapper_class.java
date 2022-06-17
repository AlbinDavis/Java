package com.wrapper;

public class wrapper_class {
    public static void main(String[] args) {

        //AutoBoxing
        int a=10;
        Integer b= a;
        System.out.println(b);

        //auto Unboxing
        int c=b;
        System.out.println(c);


        int y = 10;
        //wrapping
        Integer x = new Integer(y);
        System.out.println(y);

        //auto unboxing
        int s=x;
        System.out.println(s);

    }
}
