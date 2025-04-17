// time complexity: O(n)
// space complexity: O(1)
class Solution {
    public int findLengthOfLCIS(int[] nums) {
        // handle edge case if needed (LeetCode guarantees nums.length >= 1)
        if (nums == null || nums.length == 0) return 0;

        int longest = 0;    // record of max length seen
        int currLen = 1;    // length of current increasing run

        // scan through array
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                currLen++;               // extend current run
            } else {
                longest = Math.max(longest, currLen);  // update best
                currLen = 1;            // reset for new run
            }
        }

        // final check in case the longest run goes to the end
        return Math.max(longest, currLen);
    }
}