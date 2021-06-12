package com.Enums;
enum Car{
        AMAZE(700000),BREEZA(800000),BMW(10000000)
    ;
private int price;
    Car(int i) {
        price=i;
    }
    int getPrice(){
        return price;
    }
}
public class method_and_constructor {
    public static void main(String[] args) {
        for(Car x:Car.values())
        System.out.println(x+"\tprice="+x.getPrice());
    }
}
