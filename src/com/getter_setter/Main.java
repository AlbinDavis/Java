package com.getter_setter;

public class Main {
    public static void main(String[] args) {
    Account acc1=new Account();
    acc1.name="alan";
    acc1.email="lbndvs@gmail.com";
    acc1.setAcc_no(123456789);
    acc1.setBalance(12000);
    acc1.add_money(2000);
    acc1.withdraw(14000);
    acc1.withdraw(1200);
    System.out.println(acc1.getAcc_no());

    }
}
