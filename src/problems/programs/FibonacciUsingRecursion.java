package problems.programs;

import java.util.HashMap;

public class FibonacciUsingRecursion {
    public static void main(String[] args) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<10;i++){
            System.out.println(fib(i,map));
        map.clear();}

    }
    private static int fib(int k, HashMap<Integer,Integer>map){
        if(k<=1){
            return k;
        }
        int first=k-1;
        int last=k-2;
        if(map.containsKey(first))
            first= map.get(first);
        else
            first= fib(first,map);
        if(map.containsKey(last)){
            last= map.get(last);}
        else{
            last= fib(last,map);

        }
        map.put(k,first+last);
        return first+last;
    }

}
