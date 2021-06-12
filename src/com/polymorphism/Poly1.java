package com.polymorphism;
//compile time polymorphism using method overloading
class A{
void show(int x , int y){
    System.out.println("x="+x+"\ny="+y);
}
void show(String s){
    System.out.println(s);
}
}
public class Poly1 {
    public static void main(String[] args) {
        A a=new A();
        a.show("java course");
        a.show(1,2);
    }
}
