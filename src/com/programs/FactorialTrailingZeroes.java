package com.programs;

public class FactorialTrailingZeroes {
    public static void main(String[] args) {

        /*
         we have to count no of 5 in that number
         if 25 onwards there is extra one that is for 25 there are 6 zeros
         125
         125/5=25 so zeros+=25
         25/5=5 so zeros+=5 =30
         5/5=1 so zeros += 1 = 31
         */
        int n=125;
        int count = 0;
        while(n>4){
            n=n/5;
            count+=n;
        }
        System.out.println(count);
    }
}
