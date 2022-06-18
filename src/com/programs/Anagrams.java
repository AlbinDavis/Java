package com.programs;

import java.util.HashMap;
public class Anagrams {
    public static HashMap<Character, Integer> counter(String st) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0 ; i<st.length();i++){
            if(map.containsKey(st.charAt(i))){
                map.put(st.charAt(i),map.get(st.charAt(i))+1);
            }
            else{
                map.put(st.charAt(i),1);
            }
        }

        return map;
        }

        public static void main (String[]args){
            String  a = "geekksforgeeks";
            String  b = "forgeeksgeeks";
            HashMap<Character,Integer> ct =counter(a);
            HashMap<Character,Integer> c2 =counter(b);
            System.out.println(ct.equals(c2));

        }
}
