package Q1456_MaximumNumberofVowelsInASubstringOfGivenLength;

import java.util.Set;

class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        int vowelCnt = 0;
        for (int i = 0; i < k; i++) {
            vowelCnt += vowels.contains(s.charAt(i)) ? 1 : 0;
        }
        int maxVowelCnt = vowelCnt;
        for (int i = k; i < s.length(); i++) {
            vowelCnt += vowels.contains(s.charAt(i)) ? 1 : 0;
            vowelCnt -= vowels.contains(s.charAt(i - k)) ? 1 : 0;
            maxVowelCnt = Math.max(maxVowelCnt, vowelCnt);
        }
        return maxVowelCnt;
    }
}
