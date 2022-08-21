package com.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubSetII {
    public static void main(String[] args) {
        int[] nums = {1, 2,2, 3};
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        for(int i:nums){
            list.add(i);
        }
        Collections.sort(list);
        findSubSet(list, subset,result,0);
        System.out.println(result);
    }

    private static void findSubSet(List<Integer> list, List<Integer> subset, List<List<Integer>> result , int i) {
        if(i==list.size()){
            result.add(subset);
            return;
        }
        subset.add(list.get(i));
        findSubSet(list, new ArrayList<>(subset),result,i+1);
        subset.remove(list.get(i));
        while(i+1<list.size() && list.get(i)==list.get(i+1)){
            i++;
        }
        findSubSet(list, new ArrayList<>(subset),result,i+1);


    }
}
