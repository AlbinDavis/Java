package problems.programs;

public class MaximumofAbsoluteValueExpression {
    public static void main(String[] args) {
        int[] a={1,2,3,4};
        int[] b= {-1,4,5,6};
        int max1 = Integer.MIN_VALUE, min1 = Integer.MAX_VALUE,max2 = max1, min2 = min1, min3 = min1,min4= min1,
                max3= max1,max4=max1;

        for(int i=0;i<a.length;i++){
            max1= Math.max(max1,a[i]+b[i]+i);
            min1 = Math.min(min1,a[i]+b[i]+i);

            max2= Math.max(max2,a[i]+b[i]-i);
            min2 = Math.min(min2,a[i]+b[i]-i);

            max3= Math.max(max3,a[i]-b[i]-i);
            min3 = Math.min(min3,a[i]-b[i]-i);

            max4= Math.max(max4,a[i]-b[i]+i);
            min4 = Math.min(min4,a[i]-b[i]+i);

        }
        int diff1 = max1-min1;
        int diff2 = max2 - min2;
        int diff3 = max3 - min3;
        int diff4 = max4 - min4;
        System.out.println(Math.max(Math.max(diff1,diff2),Math.max(diff3,diff4)));


    }
}
