package problems.programs;

public class ExcelTitleToNumber {
    public static void main(String[] args) {
        //         For a title “LEET”:

        //         L = 12
        //         E = (12 x 26) + 5 = 317
        //         E = (317 x 26) + 5 = 8247
        //         T = (8247 x 26) + 20 = 214442
        String columnTitle= "AAB";
        int sum=0;

        for(char i : columnTitle.toCharArray()){
            sum=(sum*26)+(i-'A'+1);
        }
    }
}
