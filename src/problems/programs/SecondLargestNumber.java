package problems.programs;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,4};

        int max1=Integer.MIN_VALUE;
        int max2= Integer.MIN_VALUE;

        for(int i : nums){

            if(i==max1 || i==max2){
                continue;
            }

            if(i>max1){
                max2=max1;
                max1=i;

            }
            else if(i>=max2){
                max2=i;
            }

        }
        if(max2==Integer.MIN_VALUE)
            System.out.println("no 2nd largest element");

        else
            System.out.println(max2);

    }
}
