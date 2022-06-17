package com.Generics;

public class DualGenericHolder <T,U>{
    T key;
    U value;
    DualGenericHolder(T key,U value){
        this.key=key;
        this.value= value;
    }

    public void display() {
        System.out.println(this.key +" "+this.value);
    }

    public static void main(String[] args) {
        DualGenericHolder<String,Integer> map1 = new DualGenericHolder<String,Integer>("phoneNo",3342);
        map1.display();
        DualGenericHolder<String,Integer> map2 = new DualGenericHolder<String,Integer>("id",34);
        map2.display();
    }
}
