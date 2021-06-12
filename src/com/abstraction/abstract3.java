package com.abstraction;
abstract class B{
    B(){}
    abstract void fun();
    static void f(){
        System.out.println("hello");
    }
}
class C extends B{
    void fun() {
        B.f();
    }
}
public class abstract3 {
    public static void main(String[] args) {
        C c= new C();
        c.fun();
    }
}
