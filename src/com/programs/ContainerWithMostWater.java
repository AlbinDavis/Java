package com.programs;

public class ContainerWithMostWater
{
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int max=Integer.MIN_VALUE;
        int i=0,j=height.length-1;
        while(i < j){
            int area = (j-i)*Math.min(height[i],height[j]);
            max=Math.max(area,max);
            if(height[j]<=height[i])
                j--;
            else
                i++;
        }
        System.out.println(max);
    }
}
