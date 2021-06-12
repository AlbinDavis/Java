package com.interfaces;
//difference btwn interface and abstract is that in abstract we can have
// signature of a function and we can also define the
//function too but in interface we can only have the signature of the function no definition
//whenever we implement the methods in interface we should use public infront of the method
interface first{
    void a();
    void b();
}
class AB implements first{
//the implementing class should define all the methods in the interface
    @Override
    public void a() {
        System.out.println("java");
    }

    @Override
    public void b() {
        System.out.println("is simple");
    }
}
public class interface1 {
    public static void main(String[] args) {
        AB f =new AB();
        f.a();
        f.b();


    }

}
