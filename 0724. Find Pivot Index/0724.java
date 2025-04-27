// time complexity: O(n)
// space complexity: O(1)
class Solution {
    // single‐pass with running sums
    public int pivotIndex(int[] nums) {
        // compute total sum of array
        int total = 0;
        for (int num : nums) total += num;
        int leftSum = 0;
        // scan once: at each i, rightSum = total − leftSum − nums[i]
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == total - (leftSum + nums[i])) {
                return i;  // found the pivot
            }
            leftSum += nums[i];  // include nums[i] into leftSum for next iteration
        }
        return -1;  // no pivot found
    }
}