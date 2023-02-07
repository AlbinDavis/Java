package problems.programs;

public class MaxProduct {
    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{3,4,5,2}));
    }
    public static int maxProduct(int[] arr) {
       int first = Integer.MIN_VALUE;
       int second = Integer.MIN_VALUE;
       for(int i:arr){
           if(i>first)
           {
               second=first;
               first=i;
           }
           else if(i>second){
               second=i;
           }
       }
       return (first-1)*(second-1);
    }
}
