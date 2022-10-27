package problems.programs;
//An Integer in Java has 32 bits, e.g. 00101000011110010100001000011010.
//        To count the 1s in the Integer representation we put the input int
//        n in bit AND with 1 (that is represented as
//        00000000000000000000000000000001, and if this operation result is 1,
//        that means that the last bit of the input integer is 1. Thus we add it to the 1s count.
//        ones = ones + (n & 1);
//
//        Then we shift the input Integer by one on the right, to check for the
//        next bit.
//        n = n>>>1;
//
//        We need to use bit shifting unsigned operation >>> (while >> depends on sign extension)
//
//        We keep doing this until the input Integer is 0.
//        In Java we need to put attention on the fact that the maximum integer is 2147483647. Integer type in Java is signed and there is no unsigned int. So the input 2147483648 is represented in Java as -2147483648 (in java int type has a cyclic representation, that means Integer.MAX_VALUE+1==Integer.MIN_VALUE).
//        This force us to use
//
//        n!=0
//
//        in the while condition and we cannot use
//
//        n>0
//
//        because the input 2147483648 would correspond to -2147483648 in java and the code would not enter the while if the condition is n>0 for n=2147483648.
public class NoOfOneBit {
    public static void main(String[] args) {
        int n=42949672;
        int result=0;
        while(n!=0){
            result+=(n&1);
            //Java uses leftmost bit to represent the sign of that number since java is based on signed
            //when we use normal >> it fills msb or leftmost bit by 0 for positive and 1 for negative
            // so for positive its fine but for negative there will be one extra one at right when we shift using >>
            // so we use >>> it fills 0 for both
            // a=60,b=-60
            // a = 0000 0000 0000 0000 0000 0000 0011 1100
            // b = 1111 1111 1111 1111 1111 1111 1100 0100

            // Thus a >> 1 = 0000 0000 0000 0000 0000 0000 0001 1110
            // And b >> 1 = 1111 1111 1111 1111 1111 1111 1110 0010
            //
            //Thus a >>> 1 = 0000 0000 0000 0000 0000 0000 0001 1110
            //And b >>>  1 = 0111 1111 1111 1111 1111 1111 1110 0010

            n>>>=1;
        }
        System.out.println(result);
    }
}
