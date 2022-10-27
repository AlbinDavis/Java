package problems.programs;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums={-1,0,1,2,-1,-4};
        HashMap<Integer,Integer> map= new HashMap<>();
        List<List<Integer>> list = new ArrayList();
        Set<List<Integer>> set = new HashSet<>();


        for(int i=0;i<nums.length-1;i++){
            int target = -nums[i];
            map.clear();
            for(int j=i+1;j<nums.length;j++){
                if(map.containsKey(target-nums[j]) && map.get(target-nums[j])!=j)
                {
                    list.add(Arrays.asList(nums[i],nums[j],nums[map.get(target-nums[j])]));
                }
                else{
                    map.put(nums[j],j);
                }

            }
        }
        System.out.println();
    }
}
