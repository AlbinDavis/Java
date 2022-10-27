package problems.programs;

import java.util.*;

public class CountOfEachSmallerElementInTheRightOfSelf {
    static HashMap<Integer,Integer> map = new HashMap<>();
    public static void main(String[] args) {
        int[] arr= {26, 78, 27, 100, 33, 67, 90, 23, 66, 5, 38, 7, 35, 23, 52, 22, 83, 51, 98, 69, 81, 32, 78, 28, 94, 13, 2, 97, 3, 76, 99, 51, 9, 21, 84, 66, 65, 36, 100, 41};
        int[] arrCopy=arr.clone();
        map.clear();
        mergeSort(arr,0,arr.length-1);
        List<Integer> list = new ArrayList<>();
        for(int i:arrCopy){
            if(map.containsKey(i)){
                list.add(map.get(i));
            }
            else
                list.add(0);
        }
        System.out.println(list);

    }

    private static void mergeSort(int[] arr, int left, int right) {
        if(left<right){
          int mid = left+(right-left)/2;
          mergeSort(arr,left,mid);
          mergeSort(arr,mid+1,right);
          merge(arr,left,mid,right);

        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int[] leftArray = Arrays.copyOfRange(arr,left,mid+1);
        int[] rightArray = Arrays.copyOfRange(arr,mid+1,right+1);

        int i=0,j=0,k=left;
        Set<Integer> set = new HashSet<>();
        while(i<leftArray.length && j<rightArray.length){

            if(leftArray[i]<=rightArray[j]){
                arr[k]=leftArray[i];
                k++;
                i++;
            }
            else{
                int t=i;
                while(t<leftArray.length) {
                    if (!set.contains(leftArray[t])) {
                        map.put(leftArray[t], map.getOrDefault(leftArray[t], 0) + 1);
                        set.add(leftArray[t]);
                    }
                    t++;
                }
                arr[k]=rightArray[j];


                k++;
                j++;
            }

        }
        while(i<leftArray.length)
        {
                arr[k] = leftArray[i];
                k++;
            i++;

        }
        while(j<rightArray.length){
            arr[k]=rightArray[j];
            j++;
            k++;
        }
    }
}
