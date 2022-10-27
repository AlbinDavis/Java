package problems.programs;

import java.util.*;

public class WordBreak {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("cats","dog","sand","and","cat"));
        System.out.println(wordBreak("catsandog",
               list));
        list.equals(list);

    }
    public static boolean wordBreak(String s, List<String> wordDict) {
        String str="";
        Set<String> set = new HashSet<>(wordDict);
        for(char i:s.toCharArray()){
            str+=i;
            if(set.contains(str)){
                set.remove(str);
                str="";}
        }
        System.out.println(str);
        return str.equals("");
    }
}

