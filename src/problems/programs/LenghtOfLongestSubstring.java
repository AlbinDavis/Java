package problems.programs;

import java.util.HashMap;
import java.util.Map;

public class LenghtOfLongestSubstring {
    public static void main(String[] args) {
        String s="geeksforgeeks";
        Map<Character,Integer> map = new HashMap();
        int start=0;
        int m=0;
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                start=Math.max(map.get(s.charAt(i))+1,start);
            }
            m=Math.max(m,i-start+1);
            map.put(s.charAt(i),i);
        }
        System.out.println(m);

    }
}
