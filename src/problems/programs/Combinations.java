package problems.programs;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    static List<List<Integer>> result;
    public static void main(String[] args) {

        result= new ArrayList<>();
        findCombinations(4,1, 2,new ArrayList<>());
        System.out.println(result);
    }

    private static void findCombinations(int n, int index, int k, ArrayList<Integer> list) {
        if(index==n+1){
            if(list.size()== k)
                result.add(new ArrayList<>(list));
            return;
        }

        list.add(index);
        findCombinations(n, index+1, k, list);
        list.remove(list.size()-1);
        findCombinations(n,index+1, k,list);
    }

}
