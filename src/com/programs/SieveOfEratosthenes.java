package com.programs;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n=10;
        boolean[] isPrime= new boolean[n+1];
        for(int i=0;i<n;i++){
            isPrime[i]=true;
        }
        for(int i=2;i*i<n;i++){
            if(isPrime[i]){
                for(int j=i+i;j<n;j+=i){
                    isPrime[j]=false;
                }
            }

        }
        for(int i=2;i<=n;i++){
            if(isPrime[i]){
                System.out.println(i);
            }
        }
    }
}
