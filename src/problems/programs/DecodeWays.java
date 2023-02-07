package problems.programs;

public class DecodeWays {
    public static void main(String[] args) {
        System.out.println(numDecodings("123"));

    }
    public static int numDecodings(String s) {
        if(s.length()==1)
            return 1;
        int dp[] = new int[s.length()+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=s.length();i++){
            StringBuilder sb = new StringBuilder();
            sb.append(s.charAt(i - 2)-'0');
            sb.append(s.charAt(i-1)-'0');
            int v =Integer.parseInt(sb.toString());
            int val =(v<=26)?1:0;
            dp[i]=dp[i-1]+val;
        }
        return dp[s.length()];
    }
}
