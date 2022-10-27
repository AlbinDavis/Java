package problems.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSequence {
    static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        findSubSequence(new ArrayList<>(Arrays.asList(3,1,2)),0);
    }

    private static void findSubSequence(ArrayList<Integer> arr, int i) {
        if(i>=arr.size()){
            System.out.println(list);
            return;
        }
        list.add(arr.get(i));
        findSubSequence(arr,i+1);
        list.remove(list.size()-1);
        findSubSequence(arr,i+1);
    }
}
