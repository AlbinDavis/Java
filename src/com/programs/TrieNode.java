package com.programs;

public class TrieNode {
    TrieNode[] children = new TrieNode[26];
    boolean endWord = false;

    public TrieNode(){}
    public void insert(String word) {
        TrieNode curr = this;
        for(char ch : word.toCharArray()){
            int index= ch-'a';
            if(curr.children[index]==null)
                curr.children[index] = new TrieNode();
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
}
