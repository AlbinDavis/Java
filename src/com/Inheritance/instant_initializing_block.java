package com.Inheritance;
class C{
    {
    System.out.println("course");}
}
class D extends C{
    //it is the instant initializing block which make a constructor by default and call super() function
   {
    System.out.println("java course");}
}
class instant_initializing_block {
    public static void main(String[] args) {
        new D();
    }


}
