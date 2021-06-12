package com.interfaces;
interface A{
    void study();
    void s1();
}
interface B{
    void study();
void s();
}
class C implements A,B{

    @Override
    public void study() {
        System.out.println("hello");
    }

    @Override
    public void s() {
        System.out.println("new");
    }

    @Override
    public void s1() {
        System.out.println("java");
    }
}
public class multiple_inheritance {
    public static void main(String[] args) {
        C c=new C();
        c.study();
        c.s1();
        c.s();
    }
}