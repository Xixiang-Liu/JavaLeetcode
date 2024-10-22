package Q151_ReverseWordsInAString;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public String reverseWords(String s) {
        // remove leading and trailing all types of whitespace chars
        // spaces, tabs (\t), newlines (\n), and carriage returns (\r)
        s = s.trim();
        // rgx: \s is any whitespace char, use \ to escape it, + means one or more
        List<String> wordList = Arrays.asList(s.split("\\s+"));
        Collections.reverse(wordList);
        return String.join(" ", wordList);
    }
}
