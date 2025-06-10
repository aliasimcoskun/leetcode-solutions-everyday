// time complexity: O(nlogn)
// space complexity: O(1)
class Solution {
    public int smallestRangeI(int[] nums, int k) {
        Arrays.sort(nums);
        int min = nums[0] + k; // add k to the smallest
        int max = nums[nums.length-1] - k; // substract k from the largest
        // if min is smaller than max, return the difference
        return max <= min ? 0 : max - min;
    }
}