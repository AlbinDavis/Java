package com.company;
import java.util.Scanner;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number to check");
        n=s.nextInt();
        if(n%2==0){
            System.out.println("Number is even");
        }
        else{
            System.out.print("Number is odd");
        }
    }
}
