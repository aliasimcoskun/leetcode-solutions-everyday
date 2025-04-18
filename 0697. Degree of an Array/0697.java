// time complexity: O(n)
// space complexity: O(n)
class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();       // number - frequency
        Map<Integer, Integer> first = new HashMap<>();       // number - first index

        int degree = 0;
        int minLen = nums.length;
        for(int i=0; i<nums.length; i++){
            first.putIfAbsent(nums[i], i);                   // record first occurrence
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);   // increment count

            // update degree and minimum length accordingly
            int freq = count.get(nums[i]);
            if (freq > degree) {
                degree = freq;
                minLen = i - first.get(nums[i]) + 1;
            }
            else if (freq == degree) {
                minLen = Math.min(minLen, i - first.get(nums[i]) + 1);
            }
        }
        return minLen;
    }
}