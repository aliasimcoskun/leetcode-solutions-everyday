class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> counter = new HashMap<>();
        
        // int half=nums.length/2;
        for(int i=0; i<nums.length; i++){
            counter.put(nums[i], counter.getOrDefault(nums[i], 0) + 1);
            // if (counter.get(nums[i]) > half){
            //     return nums[i];
            // }
        }

        int result=-1;
        int maxValue = Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> entry : counter.entrySet()){
            if (entry.getValue() > maxValue){
                maxValue = entry.getValue();
                result = entry.getKey();
            }
        }
        return result;
    }
}