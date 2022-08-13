package com.programs;

public class TotalHammingDistance {
    public static void main(String[] args) {
        int a = 2;
        int b=4;
        int c=14;

        String str = Integer.toBinaryString(a);
        String str1 = Integer.toBinaryString(b);
        String str2 = Integer.toBinaryString(c);
        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(Integer.valueOf(str1)+Integer.valueOf(str)+Integer.valueOf(str2));

    }
}
