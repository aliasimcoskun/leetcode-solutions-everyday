// time complexity: O(n*k)
// space complexity: O(1)
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i = 0;
        int total = Integer.MIN_VALUE;

        // loop until the window reaches the end of the array
        while (i + k <= nums.length) {  // runs approximately O(n) times
            int current_total = 0;
            // sum up the values within the current window of size k
            for (int m = i; m < i + k; m++) {  // each iteration takes O(k) time
                current_total += nums[m];
            }
            // update total if the current window sum is larger
            total = Math.max(total, current_total);
            i++;
        }
        // return the maximum average by dividing the maximum total sum by k
        return (double) total / k;
    }
}
