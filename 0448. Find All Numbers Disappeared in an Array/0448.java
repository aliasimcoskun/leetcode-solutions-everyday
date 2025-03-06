// time complexity: O(n)
// space complexity: O(1)
class Solution {
    // without extra space (except return list)!!!
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> result = new ArrayList<Integer>();

        for(int i=0; i<nums.length; i++){
            // The TOTAL number of swap operations in the while loop is O(n).
            // so that, it is amortised analysis.
            while (nums[i] != nums[nums[i]-1]){ 
                // while loop runs until comparing same two numbers.
                int temp = nums[nums[i]-1];
                nums[nums[i]-1] = nums[i];
                nums[i] = temp;
            }
        }
        
        // find the missing numbers
        for(int i=0; i<nums.length; i++){
            if(nums[i] != i+1) result.add(i+1);
        }

        return result;
    }
}