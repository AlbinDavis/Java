package com.programs;

public class isSubSequence {
    public static void main(String[] args) {
        String s = "abc", t = "ahbgdc";
        System.out.println(isSubsequence(s,t));
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
}
