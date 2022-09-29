package com.programs;

import java.util.Stack;

public class MakeGoodString {
    public static void main(String[] args) {
        String s = "leEeetcodD";
        Stack<Integer> stack = new Stack<>();
        System.out.println();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)!=s.charAt(i+1)){
                if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(i+1))){
                    sb.append(s.charAt(i));
                }
                else{
                    i+=1;
                }
            }
            else
                sb.append(s.charAt(i));
        }
        System.out.println(sb);
    }
}
