package problems.programs;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        for(int i =1;i<arr.length;i++){
            int temp = arr[i];
            int j=i;
            while(j>0 && arr[j-1]>temp ){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
