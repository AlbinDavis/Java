package bank_account;
public class Account {
    public String name;
    private int acc_no;
    private int balance;
    public String email;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public int getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(int acc_no) {
        this.acc_no = acc_no;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void openaccount(){
        System.out.println("Account opened for"+name);
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