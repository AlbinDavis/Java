package com.programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String str1 = "aab";
        String str2 = "xxy";
        Map<Character,Integer> counter1 = counter(str1);
        Map<Character,Integer> counter2 = counter(str2);
        List<Integer> list = new ArrayList<>();



    }


    private static Map<Character,Integer> counter(String str1) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            map.put(str1.charAt(i), map.getOrDefault(str1.charAt(i), 0) + 1);
        }
        return map;
    }
}
