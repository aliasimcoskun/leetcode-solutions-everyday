// time complexity: O(n^2)
// space complexity: O(n)
class Solution {
    // two-pointer solution
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // O(nlogn)

        for(int i=0; i<nums.length-2; i++){
            if(i>0 && nums[i] == nums[i-1]) continue; //skip duplicates for i

            int left = i+1;
            int right = nums.length-1;

            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];

                if(sum == 0){
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    // skip duplicates for left
                    while(left < right && nums[left] == nums[left-1]) left++;
                    // skip duplicates for right
                    while(left < right && nums[right] == nums[right+1]) right--;
                }
                else if(sum < 0){
                    left++; // increase the sum
                }
                else{
                    right--;// decrease the sum
                }
            }
        }
        return result;
    }
}