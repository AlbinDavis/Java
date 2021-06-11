package com.Inheritance;
class base {
    public void baseclass() {
        System.out.println("base class");
    }
}
    class Course extends base {
        public void print() {
            System.out.println("child class");
        }
    }

public class inheritance {

    public static void main(String[] args) {
    Course java =new Course();
    java.baseclass();
    java.print();

    }
}
