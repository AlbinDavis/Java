package problems.programs;

public class FourDivisors {
    public static void main(String[] args) {
        int[] arr ={21,21,7};
        int sum=0;
        for(int n: arr) {
            int count =0;
            int bsum=0;
            for (int i = 1; i <=Math.sqrt(n); i++) {
                if (n % i == 0) {
                    if(n/i==i){
                        count++;
                        bsum+=i;}
                    else{
                    count+=2;
                    bsum += (n / i)+i;
                    }
                    if(count>4){
                        break;
                    }
                }

            }
            if(count==4){
                sum+=bsum;
            }
        }
        System.out.println(sum);
    }
}
