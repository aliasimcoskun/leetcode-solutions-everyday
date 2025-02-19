class Solution {
    public int singleNumber(int[] nums) {
        // array is non-empty
        // the solution should be O(n)
        Map<Integer, Integer> counter = new HashMap<>();
        // <key, value>
        for(int i=0; i<nums.length; i++){
            // getOrDefault():
            // if there is key as num return value of it
            // if not return the second parameter as value
            counter.put(nums[i], counter.getOrDefault(nums[i], 0) + 1);
        }

        // check the values of all keys.
        for(Integer key : counter.keySet()){
            // if the value of the key is 1, return the key.
            if(counter.get(key)==1) return key;
        }
        
        return -1;
    }
}