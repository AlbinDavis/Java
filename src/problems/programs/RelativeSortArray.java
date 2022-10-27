package problems.programs;

import java.util.Arrays;

public class RelativeSortArray {
    public static void main(String[] args) {

        int[] arr= {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2= {2,1,4,3,9,6};
        int max=arr[0];
        int min = arr[0];
        for(int i:arr){
            if(i>max)
                max=i;
            else if(i<min)
                min=i;
        }
        int[] frequencyArray = new int[max-min+1];

        for(int i=0;i<arr.length;i++){
            frequencyArray[arr[i]-min]++;
        }

        int j=0;
        for(int i : arr2){
            while(frequencyArray[i-min]!=0){
                arr[j]=i;
                j++;
                frequencyArray[i-min]--;
            }
        }

        for(int i=0;i<frequencyArray.length;i++){
            while(frequencyArray[i]!=0){
                arr[j]=i+min;
                j++;
                frequencyArray[i]--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
