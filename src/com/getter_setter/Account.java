package com.getter_setter;
public class Account {
    public String name;
    private int acc_no;
    private int balance;
    public String email;
    private int rollno;
    public String fathers_name;


    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(int acc_no) {
        this.acc_no = acc_no;
    }


    public void add_money(int money){
        balance+=money;
        System.out.println("Current balance is"+balance);
    }
    public void withdraw(int amt)
    {
        if(amt<=balance){
            balance=balance-amt;
            System.out.println("Current balance is"+balance);
        }
        else{
            System.out.println("Insufficent Balance");
        }
    }


}