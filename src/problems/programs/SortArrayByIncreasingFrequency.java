package problems.programs;

import java.util.Arrays;
import java.util.HashMap;
public class SortArrayByIncreasingFrequency {
    public static void main(String[] args) {
        Integer[] nums = {1,1,2,2,2,3};
        //List<Integer> list = new ArrayList<>(Arrays.asList(31, -19, 7, 97, 97, 7, 31, -93, -19, 97, 7, 7, 7, 31, 7, -93, 97, -93, 7, -93, -93, 7, -19, 31, -93, -93, 31, -93, 97, 97, -93, -19, 97, -19, -19, 7, -93, 7, -19, -93, -19, 7, -19, -93, 97, -93, 97, 97, -93, 97, 97, -93, 7, -19, -19, 31, -93, -93, 31, 7, -19, -19));

        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        Arrays.sort(nums,(x, y)->{
            int f1 = map.get(x);
            int f2 = map.get(y);
            if(f1==f2)
                return y-x;
            else
                return f1-f2;
            }
        );
        System.out.println(Arrays.toString(nums));
    }
}
