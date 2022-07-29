package com.programs;

public class NoOfOneBit {
    public static void main(String[] args) {
        int n=42949672;
        int result=0;
        while(n>0){
            result+=n&1;
            n>>=1;
        }
        System.out.println(result);
    }
}
