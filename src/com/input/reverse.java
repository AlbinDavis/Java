package com.input;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int r,s=0;
        while(n>0){
            r=n%10;
            s=s*10+r;
            n=n/10;
        }
        System.out.println(s);
    }
}
