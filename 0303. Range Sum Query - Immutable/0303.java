/**
 * Time Complexity:
 * - Constructor: O(1) → Just assigns the reference to the input array.
 * - sumRange(left, right): O(n) → Iterates through the entire array to check indices.
 *
 * Space Complexity:
 * - O(1) → No extra space is used apart from storing the reference to nums.
 */
class NumArray {
    private int[] nums; // Stores the input array

    // Constructor to initialize the nums array
    public NumArray(int[] nums) {
        this.nums = nums;
    }
    
    public int sumRange(int left, int right) {
        int total=0;
        // Iterate through the entire array and sum only the relevant range
        for(int i=0; i<nums.length; i++){
            if(left <= i && i<=right){
                total+=nums[i];
            }
        }
        return total;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */