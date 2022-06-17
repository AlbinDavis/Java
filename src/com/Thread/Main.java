package com.Thread;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        MathUtil mathUtil= new MathUtil();
        Thread1 thread1 = new Thread1(mathUtil);
        Thread thread2 = new Thread(new Thread2(mathUtil));
        thread1.start();
        thread2.start();

    }
}
