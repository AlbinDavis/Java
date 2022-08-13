package program;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StringMapping {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>(Arrays.asList( "i", "like", "sam", "sung", "samsung", "mobile", "ice",
                "cream", "icecream", "man", "go", "mango"));
        String inputString = "icecream";
        String checkString ="";



        for(int i=0;i<inputString.length();i++){
            checkString+=inputString.charAt(i);
            if(set.contains(checkString)){
                checkString = "";
            }
        }
        if(checkString.length()!=0){
            System.out.println("NO");
        }
        else{
            System.out.println("yes");
        }
    }
}
