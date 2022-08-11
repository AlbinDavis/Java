package com.programs;

public class FactorialRec {
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }

    private static int factorial(int value) {
        if(value<=1){
            return 1;
        }

        return value*factorial(value-1);
    }
}
