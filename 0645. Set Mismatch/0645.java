// time complexity: O(n)
// space complexity: O(n)
class Solution {
    public int[] findErrorNums(int[] nums) {
        // first index will be zero always
        boolean[] seen = new boolean[nums.length+1];

        // find duplicate
        int duplicate = 0;
        for(int num : nums){
            if(seen[num]) duplicate = num;
            else seen[num] = true;
        }

        // find missing
        int missing = 0;
        for(int i=1; i<=nums.length; i++){
            if(!seen[i]){
                missing = i;
                break;
            }
        }

        return new int[]{duplicate, missing};
    }
}