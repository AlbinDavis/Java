package com.Inheritance;
class base {
    public void baseclass() {
        System.out.println("hello");
    }
}
    class Course extends base {

    }

public class inheritance {

    public static void main(String[] args) {
    Course java =new Course();
    java.baseclass();

    }
}
