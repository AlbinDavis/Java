//package com.programs;
//
//public class Search2DMatrix {
//    public static void main(String[] args) {
//        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
//        int target = 3;
//        System.out.println(searchMatrix(matrix,target));
//    }
//    public static boolean searchMatrix(int[][] matrix, int target) {
//
//        int left = 0;
//        int right = matrix.length-1;
//        int col=matrix[0].length-1;
//        while(left<=right){
//            int  mid = left+(right-left)/2;
//            if(matrix[mid][col]==mid){
//                return true;
//            }
//        }
////        int col=matrix[0].length-1;
////
////        for(int i=0;i<matrix.length;i++){
////            if(matrix[i][col]==target){
////                return true;
////            }
////            else if(matrix[i][col]>target){
////              return searchBinary(i,matrix,target);
////            }
////        }
////        return false;
//    }
//
//    private static boolean searchBinary(int row,int[][] matrix,int target)
//    {
//        int start =0;
//        int end = matrix[0].length-1;
//        while(start<=end){
//            int mid = start+(end-start)/2;
//            if(matrix[row][mid]==target){
//                return true;
//            }
//            else if(matrix[row][mid]<target){
//                start = mid+1;
//            }
//            else{
//                end = mid-1;
//            }
//        }
//        return false;
//    }
//}
