package problems.programs;

public class ReverseDigit {
    public static void main(String[] args) {
        int n=43261596;
        int result = 0;
        for(int i=0;i<32;i++){
            result+=n & 1;
            //OR result^=n & 1;
            n>>=1;
            if(i<31){
                result<<=1;
            }

        }
        System.out.println(result);
    }
}
