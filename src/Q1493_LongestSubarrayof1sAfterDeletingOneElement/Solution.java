package Q1493_LongestSubarrayof1sAfterDeletingOneElement;

class Solution {
    public int longestSubarray(int[] nums) {
        int wd0Cnt = 0, longestWdL = 0, left = 0;
        for (int right = 0; right < nums.length; right++) {
            wd0Cnt += (nums[right] == 0 ? 1 : 0);
            while (wd0Cnt > 1) {
                wd0Cnt -= (nums[left] == 0 ? 1 : 0);
                left++;
            }
            // why not right - left + 1:
            // we must discard one element, no matter has 0 or not!
            longestWdL = Math.max(longestWdL, right - left);
        }
        return longestWdL;
    }
}
