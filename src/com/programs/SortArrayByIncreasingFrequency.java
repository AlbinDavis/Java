package com.programs;

import java.util.*;

public class SortArrayByIncreasingFrequency {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,2,2,3));
        //List<Integer> list = new ArrayList<>(Arrays.asList(31, -19, 7, 97, 97, 7, 31, -93, -19, 97, 7, 7, 7, 31, 7, -93, 97, -93, 7, -93, -93, 7, -19, 31, -93, -93, 31, -93, 97, 97, -93, -19, 97, -19, -19, 7, -93, 7, -19, -93, -19, 7, -19, -93, 97, -93, 97, 97, -93, 97, 97, -93, 7, -19, -19, 31, -93, -93, 31, 7, -19, -19));
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer i : list) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        Collections.sort(list, (x, y) -> {
            int f1 = map.get(x);
            int f2 = map.get(y);

            if (f1 != f2) {
                return f1 - f2;
            }
            if(f1==f2){
                if(x!=y){
                    return y-x;
                }
                else{
                    return 0;
                }
            }

            return -1;
        });
        System.out.println(list);
    }
}
