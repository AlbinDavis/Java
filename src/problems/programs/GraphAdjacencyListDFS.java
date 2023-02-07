package problems.programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GraphAdjacencyListDFS {
    public static void main(String[] args) {
        Map<Integer,List<Integer>> map= new HashMap<>();
        map.put(0,List.of(1,2));
        map.put(1,List.of(2,3));
        map.put(3,List.of(3));
        map.put(2,List.of(0));
        map.put(4,List.of(5));
        map.put(5,new ArrayList<>());
        map.put(6,new ArrayList<>());

        int count = 0;
        int n=map.size();
        boolean[] vis = new boolean[n];
        for(Map.Entry<Integer,List<Integer>> m:map.entrySet()){
            if(!vis[m.getKey()]){
                dfs(m.getKey(),map,vis);
                count++;
            }
        }
        System.out.println(count);
    }

    private static void dfs(Integer x, Map<Integer, List<Integer>> map, boolean[] vis) {
        vis[x]=true;
        for(int i : map.get(x)){
            if(!vis[i]){
                dfs(i,map,vis);
            }
        }
    }
}
