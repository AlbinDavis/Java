package problems.programs;

public class SumOfFirstN_Numbers {
    public static void main(String[] args) {
        System.out.println(findSum(5));
    }
    private static int findSum(int n){
        if(n==1){
            return 1;
        }
        return n+findSum(n-1);
    }
}
