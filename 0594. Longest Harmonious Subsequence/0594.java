// time Complexity: O(n)
// space Complexity: O(n)
public class Solution {
    public int findLHS(int[] nums) {
        // create a HashMap to count frequency of each number
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int longest = 0;
        // iterate through keys and check if key + 1 exists
        for (int key : map.keySet()) {
            if (map.containsKey(key + 1)) {
                // update longest if current harmonious subsequence is longer
                longest = Math.max(longest, map.get(key) + map.get(key + 1));
            }
        }
        return longest;
    }
}