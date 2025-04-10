// time complexity: O(n)
// space complexity: O(1)
class Solution {
    public int maximumProduct(int[] nums) {
        // initialize three maximum values and two minimum values
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;
        int last = Integer.MAX_VALUE, last2 = Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++){
            // update the top three maximum numbers
            if(nums[i] > first){
                third = second;
                second = first;
                first = nums[i];
            }
            else if(nums[i] > second){
                third = second;
                second = nums[i];
            }
            else if(nums[i] > third){
                third = nums[i];
            }

            // update the two smallest (minimum) numbers
            if(nums[i] < last){
                last2 = last;
                last = nums[i];
            }
            else if(nums[i] < last2){
                last2 = nums[i];
            }
        }

        // return the maximum product from either the top three
        // or two smallest and the largest number.
        return Math.max(first*second*third, first*last2*last);
    }
}