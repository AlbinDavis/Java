package com.abstraction;
abstract class base{
    //void f();    we cant write like this either we should use the abstract keyword or define the function
}
class derived extends base{
    void f() {//signature of method
        System.out.println("function vv");
    }
}
public class abstract2 {
    public static void main(String[] args) {
        derived d=new derived();
        d.f();


    }
}
