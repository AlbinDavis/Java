package problems.programs;

import java.util.*;
import java.util.LinkedList;

public class NetworkDelayTime {

    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(List.of(2,1,1));
        list.add(List.of(2,3,1));
        list.add(List.of(3,4,1));
        int k=2;
        int n=4;

        //Making Adjacency List
        Map<Integer,List<List<Integer>>> adj = new HashMap<>();
        for(List<Integer> li : list){
            int source = li.get(0);
            int dest = li.get(1);
            int dist = li.get(2);

            adj.putIfAbsent(source,new ArrayList<>());
            adj.get(source).add(List.of(dest,dist));

        }

        int[] distArray = new int[n+1];
        Arrays.fill(distArray,Integer.MAX_VALUE);
        BFS(adj,k,distArray);
        System.out.println(Arrays.toString(distArray));
        int min = Integer.MIN_VALUE;
        for(int i=1;i<=n;i++){
            min=Math.max(min,distArray[i]);
        }
        if(min==Integer.MAX_VALUE)
            System.out.println(-1);
        else
            System.out.println(min);


    }

    private static void BFS(Map<Integer, List<List<Integer>>> adj, int k, int[] distArray) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(k);
        distArray[k]=0;
        while(!queue.isEmpty()){
            int vertex = queue.poll();
            if(!adj.containsKey(vertex)){
                continue;
            }
            for(List<Integer> pair : adj.get(vertex)){
                int vert = pair.get(0);
                int dis = pair.get(1);
                int calculatedDistance = distArray[vertex]+dis;
                if(distArray[vert]>calculatedDistance) {
                    distArray[vert] = calculatedDistance;
                    queue.add(vert);
                }
            }

        }
    }
}
