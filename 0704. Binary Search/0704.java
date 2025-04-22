// time complexity: O(logn)
// space complexity: O(logn) - due to recursion stack
class Solution {

    // recursive binary search
    public int search(int[] nums, int target) {
        // nums is sorted in ascending order
        // find an algorithm with O(logn) runtime complexity
        return helper(nums, target, 0, nums.length-1);
    }

    // helper method that recurses on subarray [left..right]
    public int helper(int[] nums, int target, int left, int right){
        if(left > right) return -1; // not found

        // "(left+right)/2" calculation risks overflow. So,
        // midpoint = start-point + half distance
        int mid = left + (right - left)/2;

        if(nums[mid] == target) return mid; // found target
        else if(nums[mid] < target) return helper(nums, target, mid+1, right); // right half
        else return helper(nums, target, left, mid-1); // left half
    }
}