package problems.programs;

import java.util.Arrays;

public class AggressiveCow {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,7};
        Arrays.sort(arr);
        int noOfCows=3;
        int left=1;
        int right = arr[arr.length-1]-arr[0];
        int possibleDistance=0;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(isDistancePossible(arr,noOfCows,mid)){
                possibleDistance=mid;
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        System.out.println(possibleDistance);
    }

    private static boolean isDistancePossible(int[] arr,int noOfCows,int distance) {
        int start=0;
        int count = 0;
        for (int i = 1; i < arr.length; i++){
            if(arr[i]-arr[start]>=distance){
                start=i;
                count++;
                if (count >= noOfCows - 1) {
                        return true;
                    }
            }
        }
        return false;
    }


}
    ////////////////////BRUTE FORCE////////////////////////////
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 4, 8, 9, 12, 16};
//        int noOfCows = 4;
//        int maxMinDistance = 1;
//        int maxDistance = arr[arr.length - 1] - arr[0];
//        int distance = 1;
//        while (distance <= maxDistance) {
//            int start = 0, count = 0;
//            for (int i = start + 1; i < arr.length; i++) {
//                if (arr[i] - arr[start] >= distance) {
//                    start = i;
//                    count++;
//                    if (count >= noOfCows - 1) {
//                        maxMinDistance = distance;
//                        distance++;
//                        break;
//                    }
//                }
//            }
//            if (count < noOfCows - 1) {
//                break;
//            }
//        }
//        System.out.println(maxMinDistance);
//    }
