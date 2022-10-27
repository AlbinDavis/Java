package problems.programs;

import java.util.*;

public class NextLargerElement {
    public static void main(String[] args) {
        long[] arr = {6, 8 ,0, 1 ,3};
        long[] ans = new long[arr.length];
        int j=arr.length-1;
        Stack<Long> stack = new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()<arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[j]=-1;
            }
            else{
                ans[j]=stack.peek();
            }
            stack.push(arr[i]);
            j--;
        }
        System.out.println(Arrays.toString(ans));
    }
}
