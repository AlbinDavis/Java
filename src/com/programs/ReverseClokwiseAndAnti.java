package com.programs;

import java.util.Arrays;

public class ReverseClokwiseAndAnti {
    public static void main(String[] args) {

       Integer [] a = {1,2,3,4,5};
       int i=a.length-1;
        int temp = a[a.length-1];
        while(i>0){
            a[i]=a[i-1];
            i-=1;
        }
        a[0]=temp;
        System.out.println(Arrays.asList(a));
    }
}
