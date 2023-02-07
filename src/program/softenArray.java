package program;

import java.util.Arrays;

public class softenArray {
    public static void main(String[] args) {
        int[]  arr = {98,2,56,4,45,1};
        for(int i=1;i<arr.length-1;i++){
            arr[i]=(arr[i]+arr[i+1]+arr[i-1])/3;
        }
        System.out.println(Arrays.toString(arr));
    }
}
//            for(int j=i-1;j<=i+2&&j<arr.length;j++){
//                sum+=arr[j];
//            }
