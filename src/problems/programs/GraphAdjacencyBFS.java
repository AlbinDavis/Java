package problems.programs;

import java.util.*;
import java.util.LinkedList;

public class GraphAdjacencyBFS {
    public static void main(String[] args) {
        Map<Integer, List<Integer>> map= new HashMap<>();
        map.put(0,List.of(2,1));
        map.put(1,List.of(2,3));
        map.put(3,List.of(3,4));
        map.put(2,List.of(0));
        map.put(4,new ArrayList<>());
//        map.put(4,List.of(5));
//        map.put(5,new ArrayList<>());
//        map.put(6,new ArrayList<>());

        int count = 0;
        int n=map.size();
        boolean[] vis = new boolean[n];
        for(Map.Entry<Integer,List<Integer>> m:map.entrySet()){
            if(!vis[m.getKey()]){
                bfs(m.getKey(),map,vis);
                count++;
            }
        }
        //System.out.println(count);
    }

    private static void bfs(Integer key, Map<Integer, List<Integer>> map, boolean[] vis) {
        Queue<Integer> q = new LinkedList<>();
        vis[key]=true;
        q.add(key);
        while(!q.isEmpty()){
            int curr = q.poll();
            System.out.println(curr);
            for(int i : map.get(curr)){
                if(!vis[i]){
                    q.add(i);
                    vis[i]=true;
                }
            }
        }
        System.out.println("\n");
    }
}
