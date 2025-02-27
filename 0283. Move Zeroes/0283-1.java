// time complexity: O(n)
// space complexity: O(1)
class Solution {
    public void moveZeroes(int[] nums) {
        int counter = 0;
        // count the non-zero elements and overwrite it to the front of the array.
        for(int num : nums){
            if (num != 0){ 
                nums[counter++] = num;
            }
        }

        // fill the remaining part with zeroes
        for(int j=counter; j<nums.length; j++) nums[counter++] = 0;
    }
}