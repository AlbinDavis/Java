package com.polymorphism;
//runtime poly is achieved using method overriding
class Bank{
    void loan(){
        System.out.println("Bank loan");
    }}
    class Bank1 extends Bank{
        void loan(){
            System.out.println("Bank1 loan");
        }
    }
class Bank2 extends Bank{
    void loan(){
        System.out.println("Bank2 loan");
    }
}

public class run_time_poly1 {
    public static void main(String[] args) {
        Bank banks[]=new Bank[2];
        banks[0]=new Bank1();
        banks[1]=new Bank2();
        for(Bank bank:banks){
            bank.loan();
        }

    }
}
