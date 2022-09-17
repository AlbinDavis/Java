package com.programs;

import java.util.ArrayList;
import java.util.List;

public class CountOfSubsequenceInString {
    static List<String> result;
    static int count;
    public static void main(String[] args) {
        result = new ArrayList<>();
        count=0;
        String s1="geeksforgeeks";
        String s2="gks";
        subsequenceCount(s1,s2,0);
        System.out.println(count);
    }
    private static void subsequenceCount(String s1,String s2,int index){

        if(index==s2.length()){
            if(result.size()==s2.length()) {
                int f=0;
                for(int i=0;i<s2.length();i++){
                    if(!String.valueOf(s2.charAt(i)).equals(result.get(i))) {
                        f = 1;
                        break;
                    }
                }
                if(f==0)
                    count++;

            }
            return;
        }

        result.add(String.valueOf(s1.charAt(index)));
        subsequenceCount(s1,s2,index+1);
        result.remove(result.size()-1);
        subsequenceCount(s1,s2,index+1);

    }
}
