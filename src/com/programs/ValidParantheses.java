package com.programs;

import java.util.ArrayList;
import java.util.List;

public class ValidParantheses {
    public static void main(String[] args) {
        int n=2;
        List<String> result = new ArrayList<>();
        List<String>list = new ArrayList<>();
        findParentheses(result,list,n,0,0);
        System.out.println(result);
    }

    private static void findParentheses(List<String> result, List<String> list, int n, int open, int close) {
        if(open==close && open==n){
            result.add(String.join("",list));

            return;
        }
        if(open<n){
            list.add("(");
            findParentheses(result,list,n,open+1,close);
            list.remove(list.size()-1);
        }
        if(open>close){
            list.add(")");
            findParentheses(result,list,n,open,close+1);
            list.remove(list.size()-1);
        }
    }
}
