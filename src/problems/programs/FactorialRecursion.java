package problems.programs;

import java.util.ArrayList;

public class FactorialRecursion {
    static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) {

        System.out.println(fact(3));
    }
    private static int fact(int n){
        if(n<=1)
        return 1;
        else
            return n*fact(n-1);
    }
}
