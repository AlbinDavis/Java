package problems.programs;

public class GCD {
    public static void main(String[] args) {
        System.out.println(gcd(96,128));

    }
    private static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        else{
            return gcd(b%a,a);
        }
    }
}
