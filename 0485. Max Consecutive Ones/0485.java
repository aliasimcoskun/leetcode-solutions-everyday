// time complexity: O(n)
// space complexity: O(1)
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int current_max = 0;
        int max = 0;

        for(int num : nums){
            if(num==1){
                current_max++; // increase the count if 1 is found
                if(current_max > max) max = current_max;
            }
            else current_max = 0; // reset the count if 0 is found
        }

        return max;
    }
}