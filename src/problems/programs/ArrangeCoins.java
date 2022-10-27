package problems.programs;

public class ArrangeCoins {
    public static void main(String[] args) {
        int n=1804289383;
        long left=0,right=n,result=0;
        int res=placeCoins(n,left,right,result);
        System.out.println(res);
//        long left=0,right=n,result=0,sum;
//        while(left<=right)
//        {
//            long mid=left+(right-left)/2;
//            sum=(mid*(mid+1))/2;
//            if(sum<=n)
//            {
//                result=mid;
//                left=mid+1;
//            }
//            else{
//                right=mid-1;
//            }
//        }
//        System.out.println((int)result);
    }

    private static int placeCoins(int n,long left, long right, long result) {
        if(left>right)
            return (int)result;
        long mid=left+(right-left)/2;
        long sum=(mid*(mid+1))/2;
        if(sum==n)
            return (int)mid;
        if(sum<n){
            result=mid;
            return placeCoins(n,mid+1,right,result);
        }
        else return placeCoins(n,left,mid-1,result);


    }
}
