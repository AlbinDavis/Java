package problems.programs;

import java.util.*;

public class CheapestFlightWithKStops {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(List.of(4,1,1));
        list.add(List.of(1,2,100));
        list.add(List.of(2,0,100));
        list.add(List.of(1,3,600));
        list.add(List.of(2,3,200));
        int src = 0, dst = 3, k = 1;

        //Making Adjacency List
        Map<Integer,List<List<Integer>>> map = new HashMap<>();
        for(List<Integer> arr:list){
            int vert = arr.get(0);
            int dest = arr.get(1);
            int cost = arr.get(2);

            map.putIfAbsent(vert,new ArrayList<>());
            map.get(vert).add(List.of(dest,cost));
        }

        //Creating Priority Queue
        Queue<List<Integer>> pq = new PriorityQueue<>((x,y)->x.get(1)-y.get(1));

        //adding initial tuple to the pq
        pq.add(List.of(src,0,0));

        //Iteration on graph
        while(!pq.isEmpty()){
            List<Integer> curr = pq.poll();
            int v= curr.get(0);
            int c= curr.get(1);
            int stops= curr.get(2);
            if(v==dst) {
                System.out.println(c);
                break;
            }
            if(stops>k)
                continue;

            for(List<Integer> li : map.get(v)){
                int vertex = li.get(0);
                int cost = li.get(1);
                pq.add(List.of(vertex,c+cost,stops+1));
            }
        }



    }
}
