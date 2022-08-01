package com.programs;


public class CheckIfArrayPairsAreDivisibleByK {
    public static void main(String[] args) {

        int k=18;
        int[] arr = {1,2,3,4,5,10,6,7,8,9};
//                {2,3,7,-9,4,4,7,3,2,10,8,15,2,1,-8,10,-5,10,
//                        -2,21,9,20,0,4,24,5,12,-10,8,9,18,13,
//                        -8,10,-4,-3,0,16,-4,8,14,15,-9,0,0,-6,
//                        11,-3,10,11,7,-1,-5,5,11,2,5,9,-2,8,9,
//                        -10,6,-2,7,8,3,0,-2,11};
                //{3,8,7,2};
                //{-1,-1,-1,-1,2,2,-2,-2};
        System.out.println(canArrange(arr,k));
    }
    private static boolean canArrange(int[] arr, int k) {
        int[] modularSpace = new int[k];

        for(int i=0;i<arr.length;i++){
            modularSpace[Math.floorMod(arr[i],k)]++;
        }
        for(int i=0;i<=modularSpace.length/2;i++)
        {
            if(i==0){
                if(modularSpace[i] %2!=0 )
                    return false;
            }
            else{
                if(modularSpace[i]!=modularSpace[k-i] ) {
                    return false;
                }
            }

        }
        return true;
    }
}
