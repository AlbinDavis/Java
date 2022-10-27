package problems.programs;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] anagrams = {"eat", "tea", "tan", "ate", "nat", "bat"};
        Map<Map<Character, Integer>, List<String>> groupMap = new HashMap<>();
        for (String anagram : anagrams) {
            Map<Character, Integer> counterMap = counter(anagram);
            if (groupMap.containsKey(counterMap)) {
                groupMap.get(counterMap).add(anagram);
            } else {
                groupMap.put(counterMap, new ArrayList<>(List.of(anagram)));
            }
        }
        System.out.println(new ArrayList<>(groupMap.values()));
    }

    private static Map<Character, Integer> counter(String anagram) {
        Map<Character, Integer> map = new HashMap<>();
        for (char i : anagram.toCharArray()) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        return map;
    }
}
