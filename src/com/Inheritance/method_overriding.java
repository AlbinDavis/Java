package com.Inheritance;
class A{
    void show(){
        System.out.println("hello");
    }

}
class B extends A {
    void show(){
        System.out.println("hello java");
    }
}
public class method_overriding {
    public static void main(String[] args) {
        B b = new B();
        b.show();
    }
}
