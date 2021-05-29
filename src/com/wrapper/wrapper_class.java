package com.wrapper;

public class wrapper_class {
    public static void main(String[] args) {
        int a=10;
        Integer wrap=Integer.valueOf(a);
        System.out.println(wrap);
        //auto boxing
        int z=wrap;
        System.out.println(z);
        //primitive to wrapper
        int y =wrap.intValue();
        System.out.println(y);
        //auto unboxing
        int s=y;
        System.out.println(s);

    }
}
