package problems.programs;

public class CountOfSubSequence {
    public static void main(String[] args) {
        String s1="subsequence";
        String s2 = "sue";
        int[][] lookUpTable = new int[s1.length()+1][s2.length()+1];
        for(int i=0;i<lookUpTable.length;i++){
                    lookUpTable[i][0]=1;
            }
        for(int i=1;i<=s1.length();i++){
            for(int j=1;j<=s2.length();j++)
            {
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    lookUpTable[i][j]=lookUpTable[i-1][j]+lookUpTable[i-1][j-1];
                }
                else{
                    lookUpTable[i][j]=lookUpTable[i-1][j];
                }
            }
        }

        System.out.println(lookUpTable[s1.length()][s2.length()]);
    }
}
