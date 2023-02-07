package problems.programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElement {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2)));
    }
    public static int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> map = new HashMap<>();
        Arrays.stream(nums).forEach(x->map.put(x,map.getOrDefault(x,0)+1));
        PriorityQueue<Integer> pq = new PriorityQueue<>((x, y)->map.get(y).compareTo(map.get(x)));

        pq.addAll(map.keySet());
        int[] result = new int[k];
        int i=0;
        while(!pq.isEmpty() && i<k)
            result[i++]=(int) pq.poll();
        return result;

    }
}
