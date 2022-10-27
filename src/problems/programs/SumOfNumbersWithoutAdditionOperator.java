package problems.programs;

public class SumOfNumbersWithoutAdditionOperator {
    public static void main(String[] args) {
        //System.out.println(add(2,3));
        int a=2;
        int b=3;
        int carry=0;
        while(b!=0){
            int temp=a;
            a=a^b;
            b=(temp&b)<<1;
        }
        System.out.println(a);
    }


    public static int add(int a,int b) {
        if(b==0){
            return a;
        }
        return add(a^b,(a&b)<<1);
    }
}
