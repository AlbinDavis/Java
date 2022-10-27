package problems.programs;

import java.util.ArrayList;
import java.util.List;

public class CountOfSubsequenceWhoseSumK {
    static List<Integer> result = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println(findSubsequenceCount(new int[]{1,3,2},0,0,0));

    }

    private static int findSubsequenceCount(int[] arr, int index, int sum,int count) {
        if(index==arr.length){
            if(sum==3)
                count++;
            return count;
        }

        result.add(arr[index]);
        sum+=arr[index];
        count=findSubsequenceCount(arr,index+1,sum,count);
        result.remove(result.size()-1);
        sum-=arr[index];
        count=findSubsequenceCount(arr,index+1,sum,count);
        return count;
    }

}
