// recursion!
class Solution {
    public int searchInsertRecursion(int[] nums, int target, int left, int right){
        int middle=((right+left)/2);

        if (nums[middle]>target){
            // System.out.println("left");
            if (middle==0 || nums[middle-1]<target) return middle;
            return  searchInsertRecursion(nums, target, left, middle-1);
        }
        else if(nums[middle]==target){
            // System.out.println("middle");
            return middle;
        }
        else{
            // System.out.println("right");
            if (middle==nums.length-1 || nums[middle+1]>target) return middle+1;
            return searchInsertRecursion(nums, target, middle+1, right);
        }
    }
    
    public int searchInsert(int[] nums, int target) {
        return searchInsertRecursion(nums, target, 0, nums.length-1);
    }
}