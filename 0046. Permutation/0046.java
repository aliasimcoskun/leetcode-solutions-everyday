// time complexity: O(n*n!)
// space complexity: O(n!)
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        // a boolean array to check if elements are used
        boolean[] used = new boolean[nums.length];
        backtrack(nums, new ArrayList<>(), result, used);
        return result;
    }

    private void backtrack(int[] nums, List<Integer> tempList, List<List<Integer>> result, boolean[] used) {
        // if the temporary list contains the full permutation, add the result
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            // if the element is already used, skip
            if (used[i]) continue;
            // mark the element and add it to the list
            used[i] = true;
            tempList.add(nums[i]);
            // add other elements by making a recursive call
            backtrack(nums, tempList, result, used);
            // then backtrack: remove the element from the list and uncheck it
            tempList.remove(tempList.size() - 1);
            used[i] = false;
        }
    }
}