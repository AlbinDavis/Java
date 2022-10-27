package problems.programs;

import java.util.ArrayList;
import java.util.List;

public class FactorsOfNumber {
    public static void main(String[] args) {
        int n=64;
        List<Integer> factors = new ArrayList<>();

        for(int i=1;i<Math.sqrt(n);i++){
            if(n%i==0){
                if(n/i!=i){
                    factors.add(i);
                    factors.add(n/i);
                }
                else{
                    factors.add(i);
                }
            }
        }
        System.out.println(factors);
    }
}
