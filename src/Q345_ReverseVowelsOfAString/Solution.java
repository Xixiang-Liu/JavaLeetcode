package Q345_ReverseVowelsOfAString;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


class Solution {
    void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    public String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        int start = 0, end = s.length() - 1;
        char[] sChar = s.toCharArray();
        while (start < end) {
            while (start < end && !vowels.contains(sChar[start]))
                start++;
            while (end > start && !vowels.contains(sChar[end]))
                end--;
            if (start < end)
                swap(sChar, start++, end--);
        }
        return new String(sChar);
    }
}
