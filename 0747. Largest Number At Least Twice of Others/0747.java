// time complexity: O(n) - two simple passes over the array
// space complexity: O(1)
class Solution {
    public int dominantIndex(int[] nums) {
        // find the value and index of the largest element
        int largest = 0, index = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
                index = i;
            }
        }
        // check that largest is at least twice every other element
        for (int i=0; i<nums.length; i++) {
            if (i != index && largest < nums[i]*2) {
                return -1;
            }
        }
        return index;
    }
}
