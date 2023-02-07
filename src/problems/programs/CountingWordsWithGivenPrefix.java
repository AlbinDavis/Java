package problems.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountingWordsWithGivenPrefix {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("pay","attention","practice","attend"));
        String prefix = "att";
        TrieNode trieNode = new TrieNode();
        for(String str : list)
            trieNode.insert(str);
        System.out.println(trieNode.findPrefixCount(prefix));

    }
}