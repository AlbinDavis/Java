package com.polymorphism;
class F{
    void show(){
        System.out.println("course");}
}
class G extends F{
    void show(){

        System.out.println("java");}
}
public class run_time_poly2 {
    public static void main(String[] args) {
        F f = new G();//upcasting
        f.show();
    }
}
