package problems.programs;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumK {
    static List<List<Integer>> result;
    public static void main(String[] args) {
        int arr[]={2,3,6,7};
        int target=7;
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
            list.add(arr[index]);
            findCombinations(arr, index, target - arr[index], list);
            list.remove(list.size()-1);
        }
        findCombinations(arr,index+1,target,list);
    }
}
