// time complexity: O(n)
// space complexity: O(1)
class Solution {
    public int thirdMax(int[] nums) {
        // Use long to handle edge cases where nums contains Integer.MIN_VALUE
        long firstMax = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > thirdMax && nums[i] < secondMax) {
                thirdMax = nums[i]; // update only thirdmax
            }
            else if (nums[i] > secondMax && nums[i] < firstMax) {
                thirdMax = secondMax; // update thirdmax and secondmax
                secondMax = nums[i];
            }
            else if (nums[i] > firstMax) {
                thirdMax = secondMax; // update thirdmax, secondmax and firstmax
                secondMax = firstMax;
                firstMax = nums[i];
            }
        }

        System.out.println(thirdMax);
        // If a third max exists, return it; otherwise, return the maximum number
        if (thirdMax != Long.MIN_VALUE) return (int)thirdMax;
        else return (int)firstMax;
    }
}
