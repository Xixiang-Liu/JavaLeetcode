package Q1679_MaxNumberOfKSumPairs;

import java.util.HashMap;

class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> seen = new HashMap<>();
        int pairCnt = 0;
        for (int num : nums) {
            int complement = k - num;
            if (seen.getOrDefault(complement, 0) > 0) {
                seen.put(complement, seen.get(complement) - 1);
                pairCnt++;
            } else {
                seen.put(num, seen.getOrDefault(num, 0) + 1);
            }
        }
        return pairCnt;
    }
}
