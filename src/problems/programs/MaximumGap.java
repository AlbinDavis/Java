package problems.programs;

import java.util.*;

public class MaximumGap {
    public static void main(String[] args) {
        Integer[] arr = {3,2,1};
        Arrays.sort(arr);
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            final int i1 = arr[i] - arr[i - 1];
            if (i1 > max) {
                max = i1;
            }
        }
        System.out.println(max);
   }
}
