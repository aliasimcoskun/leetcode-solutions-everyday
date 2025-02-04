// O(n) time complexity
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hash = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int remaining = target - nums[i]; // nums[i] + remaining = target
            if(hash.containsKey(remaining))
                return new int []{hash.get(remaining), i};
            hash.put(nums[i], i);
        }
        return new int []{};
    }
}