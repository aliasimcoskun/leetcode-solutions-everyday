// time complexity: O(n*m) in the worst case.
// space complexity: O(1)
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];

        // for each element in nums1
        for (int i = 0; i < nums1.length; i++) {
            int k = 1;
            // find the position of nums1[i] in nums2
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    // look for the next greater element to the right
                    while (j + k < nums2.length && !(nums1[i] < nums2[j + k])) {
                        k++;
                    }
                    // if not found, set -1; else set the next greater element
                    if (j + k == nums2.length) result[i] = -1;
                    else result[i] = nums2[j + k];
                }
            }
        }

        return result;
    }
}
