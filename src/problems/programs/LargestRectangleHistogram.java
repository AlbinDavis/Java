package problems.programs;

import java.util.Stack;

public class LargestRectangleHistogram {
    public static void main(String[] args) {
        int[] arr= {2,1,5,6,2,3};
        int leftArray[]=smallestOnLeftIndex(arr);
        int max=0;
        Stack<Integer> stack = new Stack<>();
        stack.push(arr.length);

        //finding the smallest on the right and same time calculating the max area
        for(int i=arr.length-1;i>-1;i--){
            while(stack.peek()!=arr.length && arr[stack.peek()]>arr[i]){
                stack.pop();
            }
            max=Math.max(max,arr[i]*(stack.peek()-leftArray[i]-1));
            stack.add(i);
        }
        System.out.println(max);

    }
    private static int[] smallestOnLeftIndex(int[] arr){
        Stack<Integer> stack = new Stack<>();
        int[] leftArray= new int[arr.length];
        stack.push(-1);
        for(int i=0;i<arr.length;i++){
            while(stack.peek()!=-1 && arr[stack.peek()]>=arr[i]){
                stack.pop();
            }
            leftArray[i]=stack.peek();
            stack.push(i);
        }
        return leftArray;
    }
}
