package com.interfaces;
//difference btwn interface and abstract is that in abstract we can have
// signature of a function and we can also define the
//function too but in interface we can only have the signature of the function no definition
//whenever we implement the methods in interface we should use public in front of the method and
//from java 8 we can use default keyword and we can have body to the method
//used for complete abstraction
//to get multiple inheritance
//provide less dependency amoung classes
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
class CD implements first{

    @Override
    public void a() {
        System.out.println("Java is");
    }

    @Override
    public void b() {
        System.out.println("Hard");
    }
}
public class interface1 {
    public static void main(String[] args) {
//        first n= new AB(); only works if all the methods of first is present in AB
//        n.a();
//        n.b();

//or
        AB f =new AB();
        CD c=new CD();
        f.a();
        f.b();
        c.a();
        c.b();


    }

}
