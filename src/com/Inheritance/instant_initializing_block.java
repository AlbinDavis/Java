package com.Inheritance;
class C{
    {
    System.out.println("course");}
}
class D extends C{
    //This is the instant initializing block which make automatically it to a constructor like
    // C(){
    // super();
    // System.out.println("java course");}
   {
    System.out.println("java course");}
}
class instant_initializing_block {
    public static void main(String[] args) {
        new D();
    }


}
