package com.polymorphism;
class D{
    int x=10;
}
class E extends D{
    int x=12;
}
public class object_slicing {
    public static void main(String[] args) {
        D d = new E();//object slicing op=10
        //data members cannot be overridden
        System.out.println(d.x);

    }

}
