package problems.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShortestUniquePreference {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("zebra", "dog", "duck", "dove"));
        TrieNode trieNode = new TrieNode();
        for(String str : list)
            trieNode.insert(str);
        List<String> result = new ArrayList<>();
        for(String word : list){
            result.add(findUnique(trieNode,word));
        }
        System.out.println(result);
    }
    public static String findUnique(TrieNode trieNode , String word){
        TrieNode curr = trieNode;
        StringBuilder sb = new StringBuilder();
        for(char ch:word.toCharArray()){
            int index = ch-'a';
            sb.append(ch);
            if(curr.children[index].count==1)
                return sb.toString();
            curr=curr.children[index];
        }
        return word;
    }
}
