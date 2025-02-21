// time complexity O(n)
// space complexity O(n)
class Solution {
    public boolean containsDuplicate(int[] nums) {
        // hashmap solution
        Map<Integer, Integer> check = new HashMap<>();
        
        for(int i=0; i<nums.length; i++){
            if(check.containsKey(nums[i])) return true;
            check.put(nums[i],1);
        }

        return false;
    }
}