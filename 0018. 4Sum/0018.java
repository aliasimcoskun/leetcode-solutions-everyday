/**
 * Finds all unique quadruplets that sum to the target.
 * time Complexity: O(n^3)
 * space Complexity: O(1) extra space (excluding output space)
 */
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        if(nums.length < 4)
            return Collections.emptyList();

        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        // First loop: select the first element of the quadruplet.
        for(int i=0; i<nums.length-3; i++){
            // skip duplicates for the first element
            if(i>0 && nums[i] == nums[i-1]) continue;

            // Second loop: select the second element.
            for(int j = i+1; j<nums.length-2; j++){
                // skip duplicates for the second element
                if(j>i+1 && nums[j] == nums[j-1]) continue;

                // two pointers for the remaining two elements
                int left = j+1;
                int right = nums.length-1;

                // search for third and fourth element
                while(left < right){
                    // cast to long to prevent integer overflow.
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
                    if(sum == target){
                        result.add(Arrays.asList(
                                nums[i], nums[j], nums[left], nums[right]));
                        left++;
                        right--;

                        // skip duplicates for the third element
                        while(left < right && nums[left] == nums[left-1]) left++;
                        // skip duplicates for the fourth element
                        while(left < right && nums[right] == nums[right+1]) right--;
                    }
                    else if(sum < target){
                        left++; // increase the sum
                    }
                    else right--; // decrease the sum
                }
            }
        }
        return result;
    }
}