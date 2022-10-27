package problems.programs;

public class Print1toNUsingBackTrack {
    public static void main(String[] args) {
        printN(5);
    }

    private static void printN(int i) {
        if(i<1)
            return;
        printN(i-1);
        System.out.println(i);
        
    }

}
