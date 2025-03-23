package Q1207_UniqueNumberOfOccurrences;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> num2Freq = new HashMap<>();
        for (int num : arr) {
            num2Freq.put(num, num2Freq.getOrDefault(num, 0) + 1);
        }
        Set<Integer> freqs = new HashSet<>(num2Freq.values());
        return freqs.size() == num2Freq.size();
    }
}

class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.uniqueOccurrences(new int[]{1, 2, 3, 4, 5}));
    }
}
