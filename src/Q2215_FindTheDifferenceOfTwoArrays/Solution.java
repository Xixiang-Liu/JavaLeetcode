package Q2215_FindTheDifferenceOfTwoArrays;

import java.util.*;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        return Arrays.asList(getSet1MinusSet2(nums1, nums2), getSet1MinusSet2(nums2, nums1));
    }

    private List<Integer> getSet1MinusSet2(int[] nums1, int[] nums2) {
        Set<Integer> onlyInNums1 = new HashSet<>();
        // Store nums2 elements in an unordered set
        Set<Integer> existsInNums2 = new HashSet<>();
        for (int x : nums2) existsInNums2.add(x);
        for (int x : nums1) {
            if (!existsInNums2.contains(x)) {
                onlyInNums1.add(x);
            }
        }
        return new ArrayList<>(onlyInNums1);
    }
}

class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findDifference(new int[]{1, 2, 3}, new int[]{2, 3, 4}));
    }
}