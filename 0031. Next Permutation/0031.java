/* time complexity:
 *  - scan array from right to left: Maximum O(n).
 *  - swap: O(1).
 *  - reverse: O(n)
 *      total = O(n) + O(1) + O(n) = O(n)
 *
 *  space complexity: O(1)
 *      - the replacement is in-place and used only constant extra memory.
 */
class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;

        // find the first decreasing element from the right
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // if found, find the element just larger than nums[i] and swap
        if (i >= 0) {
            int j = n - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }

        // reverse the sub-array after the index i
        // to be in ascending order after index i
        reverse(nums, i + 1, n - 1);
    }

    // swap two elements in the array
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // reverse elements from index start to end
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}