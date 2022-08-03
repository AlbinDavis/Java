package com.programs;

import java.util.Stack;

public class isSubSequence {
    public static void main(String[] args) {
        String s = "abc", t = "ahbgdc";
        System.out.println(isSubsequenceUsingStack(s,t));
    }
    public static boolean isSubsequence(String s, String t) {
        if(s.length()==0){
            return true;
        }
        int j=0;
        for(char i:t.toCharArray()){
            if(s.charAt(j)==i){
                j++;
            }
            if(j==s.length())
                return true;
        }
        return false;
    }
    private static boolean isSubsequenceUsingStack(String s, String t){
        if(s.length()==0){
            return true;
        }
        Stack<Character> stack = new Stack<>();
        for(char i: s.toCharArray())
            stack.add(i);
        for(int i=t.length()-1;i>=0;i--){
            if(stack.peek()==t.charAt(i)){
                stack.pop();
            }
            if(stack.size()==0){
                return true;
            }
        }
        return false;
    }
}
