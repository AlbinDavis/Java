package problems.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSequenceSumIsK {
    static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        findSubSequence(new ArrayList<>(Arrays.asList(1,1,2)),0,0);
    }

    private static void findSubSequence(ArrayList<Integer> arr, int i,int sum) {
        if(i>=arr.size()){
            if(sum==2)
                System.out.println(list);
            return;
        }
        list.add(arr.get(i));
        sum+=arr.get(i);
        findSubSequence(arr,i+1,sum);
        list.remove(list.size()-1);
        sum-=arr.get(i);
        findSubSequence(arr,i+1,sum);
    }
}
