// time complexity O(n)
// space complexity O(1)

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // hashmap solution
        Map<Integer, Integer> check = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(check.containsKey(nums[i]) && 
            Math.abs(check.get(nums[i]) - i) <= k) return true;
            else check.replace(nums[i], i);

            check.put(nums[i], i);
        }

        return false;
    }
}