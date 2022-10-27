package problems.programs;

import java.util.HashMap;
import java.util.Map;

//1st we take count of each element
// then for each count > 2, sum = sum+ count C 2;
public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] nums={1,2,3,1,1,3};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int sum=0;
        for(Map.Entry<Integer,Integer> i: map.entrySet()){
            if(i.getValue()>1){
                sum+=(i.getValue()*(i.getValue()-1))/2;
            }
        }
        System.out.println(sum);
    }
}
