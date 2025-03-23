package Q1657_DetermineIfTwoStringsAreClose;

import java.util.*;

class Solution {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) return false;
        Map<Character, Integer> c2Cnt1 = new HashMap<>();
        Map<Character, Integer> c2Cnt2 = new HashMap<>();
        for (char c : word1.toCharArray()) {
            c2Cnt1.put(c, c2Cnt1.getOrDefault(c, 0) + 1);
        }
        for (char c : word2.toCharArray()) {
            c2Cnt2.put(c, c2Cnt2.getOrDefault(c, 0) + 1);
        }
        if (!c2Cnt1.keySet().equals(c2Cnt2.keySet())) return false;
        List<Integer> word1Cnt = new ArrayList<>(c2Cnt1.values());
        List<Integer> word2Cnt = new ArrayList<>(c2Cnt2.values());
        Collections.sort(word1Cnt);
        Collections.sort(word2Cnt);
        return word1Cnt.equals(word2Cnt);
    }
}
