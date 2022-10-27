package problems.programs;

public class RectangleOverlap {
    public static void main(String[] args) {
        int[] rec1= {0,0,2,2};
        int[] rec2 = {1, 1, 3, 3};
        /*
        check(max(rec1(x1),rec2(x1))<min(rec1(x2),rec2(x2))  &&
        max(rec1(y1),rec2(y1))<min(rec1(y2),rec2(y2))
         */
        System.out.println((Math.max(rec1[0],rec2[0])<Math.min(rec1[2],rec2[2])
                &&
                Math.max(rec1[1],rec2[1]) <Math.min(rec1[3],rec2[3])));
    }
}
