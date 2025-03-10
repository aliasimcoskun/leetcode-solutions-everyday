// time complexity: O(n^2)
// space complexity: O(1)
class Solution {
    // returns the sum of three integers in nums that is closest to the target.
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int closest = Integer.MAX_VALUE;
        for(int i=0; i<nums.length-2; i++){
            int left = i+1;
            int right = nums.length - 1;

            // for every i
            while(left<right){
                int sum = nums[i] + nums[left] + nums[right];
                // update the closest
                if(Math.abs(closest-target) > Math.abs(sum-target)){
                    closest = sum;
                }
                // move the pointers
                if(sum>target) right--;
                else left++;
            }
        }

        return closest;
    }
}