/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return recursiveBST(nums, 0, nums.length-1);
    }
    private TreeNode recursiveBST(int[] nums, int left, int right){
        if(left>right) return null; // base case
        int middle = left + (right-left)/2; // the safest way!
        TreeNode node = new TreeNode(nums[middle]);
        
        node.left = recursiveBST(nums, left, middle-1); // for left
        node.right = recursiveBST(nums, middle+1, right); // for right

        return node;
    }
}