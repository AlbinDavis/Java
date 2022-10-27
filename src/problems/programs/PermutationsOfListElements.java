package problems.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsOfListElements
{
    public static void main(String[] args)
    {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,2));
        int n = list.size();
        PermutationsOfListElements permutation = new PermutationsOfListElements();

        permutation.permute(list, 0, n-1,result);
        System.out.println(result);

    }

    private void permute(List<Integer> list, int pos, int r, List<List<Integer>> result)
    {
        if (pos == r)
            result.add(new ArrayList<>(list));
        else
        {
            for (int i = pos; i <= r; i++)
            {
                if(shouldSwap(list,pos,i)){
                    list = swap(list, pos, i);
                    permute(list, pos + 1, r, result);
                    list = swap(list, pos, i);
                }
            }
        }
    }

    private boolean shouldSwap(List<Integer> list, int pos, int end)
    {
        for(int i=pos;i<end;i++){
            if(list.get(i)==list.get(end)){
                return false;
            }
        }
        return true;
    }

    public List<Integer> swap(List<Integer> list, int i, int j)
    {
        int temp=0;
        temp = list.get(i) ;
        list.set(i,list.get(j));
        list.set(j,temp);
        return list;
    }

}

