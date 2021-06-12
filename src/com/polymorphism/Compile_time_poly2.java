package com.polymorphism;
class B{
    void show(int x){
        System.out.println("x="+x);
    }
    void show(double s){
        System.out.println(s);
    }
}
public class Compile_time_poly2 {
    public static void main(String[] args) {
        B a=new B();
        a.show('p');//it is type casted and convert to integer
        a.show(66.789);
    }
}
