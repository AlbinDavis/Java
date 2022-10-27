package problems.programs;

import java.util.Random;

public class Rand10UsingRand7 {
    public int rand10() {
        Random rand = new Random();



        int x = rand.nextInt(7) + 1;
        int y = rand.nextInt(7) + 1;


        if (x > 6) {
           return rand10();
        }

        if (x == 6 && y > 5) {
           return rand10();
        }

        int v = ((x - 1) * 7) + y;
        return (v % 10) + 1;

// OR
//        if(x >4 && y<4){
//            return rand10();
//        }
//        return (x+y)%10+1;
    }
}
