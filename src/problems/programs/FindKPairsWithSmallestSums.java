package problems.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class FindKPairsWithSmallestSums {
    public static void main(String[] args) {
        List<List<Integer>> result= kSmallestPairs(new int[]{1, 7, 11}, new int[]{2, 4, 6},3);
        System.out.println(result);
    }
    public static List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        Queue<List<Integer>> pq = new PriorityQueue<>((x,y)->(y.get(0)+y.get(1))-(x.get(0)+x.get(1)));
        for(int num1:nums1){
            for(int num2:nums2){
                pq.add(List.of(num1,num2));
                if(pq.size()>k)
                    pq.poll();
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        while(!pq.isEmpty())
            result.add(pq.poll());
        return result;
    }
}
