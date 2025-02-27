// time complexity: O(n^2) at worst case scenario
// space complexity: O(1)
class Solution {
    public void moveZeroes(int[] nums) {
        // it should be in-place algorithm
        for(int i=1; i<nums.length; i++){
            if(nums[i-1]==0){ // if previous is zero, find the next non-zero number
                int j=i;
                while (j<nums.length && nums[j]==0) j++;
                if(j<nums.length) swap(nums, i-1, j);
            }
        }
    }

    // a simple swap function
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}