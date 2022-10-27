package problems.programs;

import java.util.Arrays;

public class LargestNumber {
    public static void main(String[] args) {
        int[] nums= {0,0};
        String[] arr = new String[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=Integer.toString(nums[i]);
        }
        Arrays.sort(arr,(X,Y)->{
            String XY = X+Y;
            String YX = Y+X;
            return XY.compareTo(YX) > 0 ? -1 : 1;

        });
        if(arr[0].equals("0")) System.out.println("0");;
        StringBuilder sb=new StringBuilder();
        for(String s:arr){
            sb.append(s);
        }
        System.out.println(sb.toString());
    }
}
