package com.array;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        /*int [] arr=new int[]{1, 2, 3, 4, 5};
        System.out.println(arr[3]);*/
        int[] arr=new int[20];
        Scanner s =new Scanner(System.in);
        System.out.println("enter integer elements:");
        for(int i =0;i<4;i++){
            arr[i]=s.nextInt();
        }
        for(int i =0;i<4;i++)
        {

        System.out.println(arr[i]);
    }
}}
