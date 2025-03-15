// O(log(min(m, n))) because binary search is applied on the smaller array.
// O(1) as only constant extra space is used.
class Solution {
    // median means the value in the middle.
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // ensure nums1 is the smaller array for efficient binary search
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
        int m = nums1.length, n = nums2.length;
        int low = 0, high = m;

        while (low <= high) {
            int partitionX = (low + high) / 2;
            int partitionY = (m + n + 1) / 2 - partitionX;

            // handle edge cases by using min/max integer values
            int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1];
            int minRightX = (partitionX == m) ? Integer.MAX_VALUE : nums1[partitionX];
            int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1];
            int minRightY = (partitionY == n) ? Integer.MAX_VALUE : nums2[partitionY];

            // check if we have found the correct partition
            if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
                // if total length is even, median is average of two middle elements
                if ((m + n) % 2 == 0) {
                    return ((double)Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)) / 2;
                } else { // if total length is odd, median is max of left parts
                    return (double)Math.max(maxLeftX, maxLeftY);
                }
            } else if (maxLeftX > minRightY) { // too many elements taken from nums1, move left
                high = partitionX - 1;
            } else { // too few elements taken from nums1, move right
                low = partitionX + 1;
            }
        }
        return -1;
    }
}