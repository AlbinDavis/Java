package com.programs;

public class FibRec {
    public static void main(String[] args) {
        System.out.println(fib(3));
    }
    private static int fib(int value){
        if(value<=1){
            return value;
        }
        return fib(value-1)+fib(value-2);
    }
}
