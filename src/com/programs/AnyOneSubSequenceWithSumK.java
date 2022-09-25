package com.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnyOneSubSequenceWithSumK {
    static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        findSubSequence(new ArrayList<>(Arrays.asList(1,3,2)),0,0);
    }

    private static boolean findSubSequence(ArrayList<Integer> arr, int i,int sum) {
        if(i>=arr.size()){
            if(sum==2){
                System.out.println(list);
                return true;
            }
            return false;
        }
        list.add(arr.get(i));
        sum+=arr.get(i);
        if(findSubSequence(arr,i+1,sum))
            return true;
        list.remove(list.size()-1);
        sum-=arr.get(i);
        if(findSubSequence(arr,i+1,sum))
            return true;

        return false;
    }
}
