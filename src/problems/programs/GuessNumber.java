package problems.programs;

public class GuessNumber {
    public static void main(String[] args) {
        System.out.println(guessNumber(10));
    }
    public static int guessNumber(int n) {
        int left=1;
        int right=n;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(guess(mid)==0)
                return mid;
            else if(guess(mid)==1)
                right=mid-1;
            else
                left=mid+1;
        }
        return -1;
    }

    private static int guess(int mid) {
        if(mid==6)
            return 0;
        else if(mid<6)
            return 1;
        else
            return -1;
    }
}
