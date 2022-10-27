package problems.programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RankTransformArray {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(arrayRankTransform(new int[]{40, 12,1,65,0})));
    }
    public static int[] arrayRankTransform(int[] arr) {
        int[] sortArray = arr.clone();
        int[] result = new int[arr.length];
        Arrays.sort(sortArray);

        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<sortArray.length;i++){
            map.putIfAbsent(sortArray[i],map.size()+1);
        }
    for(int i=0;i<arr.length;i++){
        result[i]=map.get(arr[i]);
    }
return result;
}}
