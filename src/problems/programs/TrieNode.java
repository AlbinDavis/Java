package problems.programs;
public class TrieNode {
    TrieNode[] children = new TrieNode[26];
    boolean endWord = false;
    Integer count =0;
    public TrieNode(){}
    public void insert(String word) {
        TrieNode curr = this;
        for(char ch : word.toCharArray()){
            int index= ch-'a';
            if(curr.children[index]==null) {
                curr.children[index] = new TrieNode();
            }
            curr.children[index].count++;
            curr = curr.children[index];
        }
        curr.endWord=true;
    }
    public boolean search(String word) {
        TrieNode curr = this;
        for(char ch: word.toCharArray()){
            int index = ch-'a';
            if(curr.children[index]== null)
                return false;
            curr = curr.children[index];
        }
        return curr.endWord;
    }
    public int findPrefixCount(String prefix){
        TrieNode curr = this;
        for(char ch: prefix.toCharArray()){
            int index = ch-'a';
            if(curr.children[index]== null)
                return 0;
            curr = curr.children[index];
        }
        return curr.count;
    }
}
