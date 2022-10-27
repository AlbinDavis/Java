package problems.programs;

public class KdeansAlogrithMaxSumOfArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,-2,5};
        int maxTillNow=Integer.MIN_VALUE;
        int sum=0;
        for(int i:arr){
            sum+=i;
            maxTillNow=Math.max(maxTillNow,sum);
            if(sum<0)
                sum=0;
        }
        System.out.println(maxTillNow);
    }
}
