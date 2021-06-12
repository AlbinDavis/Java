package com.Inheritance;
class bb{
int m1=10,m2=20;

}
class derived extends bb {
    int m3=90;
    void f(){
        System.out.println(m3);
    }
}
public class objecting_slicing {
    public static void main(String[] args) {
bb b = new derived();
//b cant acces m3 in the derived class it slices it



    }

}
