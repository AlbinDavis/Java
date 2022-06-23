package com.programs;

import java.util.HashMap;

public class countOfFirstStringInSecondString {
    public static void main(String[] args) {
        String s1 = "geeksforgeeksgeeks";
        String s2 = "ge";
        int m = 99999999;
        HashMap<Character, Integer> c1 = Anagrams.counter(s1);
        HashMap<Character, Integer> c2 = Anagrams.counter(s2);
        for (int i = 0; i < s2.length(); i++) {
            if (c1.containsKey(s1.charAt(i))) {
                m = Math.min(m, c1.get(s1.charAt(i)) / c2.get(s2.charAt(i)));
            }
        }
        System.out.println(m);
    }
}
