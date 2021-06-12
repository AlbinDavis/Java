package com.abstraction;
abstract class baseclass{
    abstract void f();
        }
class derivedclass extends baseclass{
    @Override
    void f() {
        System.out.println("function");
    }
}
public class abstraction1 {
    public static void main(String[] args) {
        derivedclass d=new derivedclass();
        d.f();
        //or
        baseclass b = new derivedclass();
        b.f();


    }
}
