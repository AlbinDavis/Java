package com.interfaces;
interface AS{
 default void fun()  {
     System.out.println("hello");
 }
}
class CC implements AS{
    }
public class interface_method_with_body {
    public static void main(String[] args) {
AS a=new CC();
a.fun();
    }
}
