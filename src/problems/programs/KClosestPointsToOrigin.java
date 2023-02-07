package problems.programs;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class KClosestPointsToOrigin {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(kClosest(new int[][]{{3, 3}, {5, -1}, {-2, 4}}, 2)));
    }
    public static int[][] kClosest(int[][] points, int k) {
        Queue<int[]> pq = new PriorityQueue<>((x, y)->
                distance(y)-distance(x));
        for(int[] i:points){
            pq.add(i);
            if(pq.size()>k)
                pq.poll();
        }

        int[][] result = new int[k][];
        return pq.toArray(new int[0][0]);
    }
    public static int distance(int[] arr){
        return arr[0]*arr[0]+arr[1]*arr[1];
    }
}
