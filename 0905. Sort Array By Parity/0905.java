// time complexity: O(n)
// space complexity: O(1)
class Solution {
    // two-pointer in-place swap
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int j = n - 1;                   // initialize right pointer
        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 1) {      // if current is odd
                if (nums[j] % 2 == 0) {      // find an even at right
                    int temp = nums[i];
                    nums[i] = nums[j];       // swap odd-left with even-right
                    nums[j] = temp;
                } else {
                    i--;                   // stay on this i to retry
                }
                j--;                       // move right pointer inward
            }
            if (i == j) break;            // stop when pointers meet
        }
        return nums;                      // return partitioned array
    }
}

