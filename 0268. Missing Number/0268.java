// time complexity O(n)
// space complexity O(n)
class Solution {
    public int missingNumber(int[] nums) {
        // create array of size length+1 for all elements
        int[] arr = new int[nums.length+1];

        // mark the existing numbers
        for(int i=0; i<nums.length; i++){
            arr[nums[i]]++;
        }

        // find the missing number
        for (int i=0; i<nums.length+1; i++){
            // System.out.print(arr[i] + " ");
            if(arr[i]==0) return i;
        }

        return -1;
    }
}