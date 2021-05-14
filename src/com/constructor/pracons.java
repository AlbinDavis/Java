package com.constructor;
class Empl {
    int a;
Empl(int roll) {

    a = roll;
}
void disp(){
    System.out.println(a);

}

}
public class pracons {
    public static void main(String[] args) {
        Empl e=new Empl(3);
        e.disp();
    }
}
