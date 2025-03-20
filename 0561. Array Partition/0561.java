// time complexity: O(nlogn)
// space complexity: O(1)
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums); // O(nlogn)
        int max = 0;
        // iterate on every pair
        for(int i=0; i<nums.length-1; i+=2){
            max += Math.min(nums[i], nums[i+1]);
        }
        return max;
    }
}