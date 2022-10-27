package problems.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum11 {
    static List<List<Integer>> result;
    public static void main(String[] args) {
        int arr[]={1,1,1,2,2};
        Arrays.sort(arr);
        int target=4;
        result= new ArrayList<>();
        findCombinations(arr,0,target,new ArrayList<>());
        System.out.println(result);
    }

    private static void findCombinations(int[] arr, int index, int target, ArrayList<Integer> list) {
        if(index==arr.length){
            if(target==0){
                result.add(new ArrayList<>(list));
            }
            return;
        }

        if(arr[index]<=target) {
            if(list.size()==0 || list.get(list.size()-1)!=arr[index])
                list.add(arr[index]);
            findCombinations(arr, index+1, target - arr[index], list);
            if(list.size()>0)
            list.remove(list.size()-1);}
        findCombinations(arr,index+1,target,list);
    }
}
