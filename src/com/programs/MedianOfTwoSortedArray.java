package com.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MedianOfTwoSortedArray {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList(Arrays.asList(1,3));
        List<Integer> list2 = new ArrayList(Arrays.asList(2,4));
        List<Integer> ans = new ArrayList();
        int i= 0;
        int j= 0;
        while(i<list1.size() && j<list2.size()){
            if(list1.get(i)<list2.get(j)){
                ans.add(list1.get(i));
                i+=1;
            }
            else{
                ans.add(list2.get(j));
                j+=1;
            }
        }

        if(j!=list2.size()){
            for(int k=j;j<list2.size();j++){
                ans.add(list2.get(k));
            }
        }
        if(i!=list1.size()){
            for(int k=i;i<list1.size();i++){
                ans.add(list1.get(k));
            }
        }
        int mid;
        float middle;
        if(ans.size()%2!=0){
            mid=ans.size()/2;
            middle=ans.get(mid);
            System.out.println(middle);
        }
        else {
            mid=ans.size()/2;
            middle=(float)(ans.get(mid)+ans.get(mid-1))/2;
            System.out.println(middle);
        }
        System.out.println(((float)5/2));
    }
}
