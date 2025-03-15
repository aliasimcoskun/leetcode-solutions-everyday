# time complexity: O(m + n).
# space complexity: O(m + n).
class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        merged = []
        total_length = len(nums1) + len(nums2)

        i = 0
        j = 0
        # merge elements until we reach the median position
        while len(merged) <= total_length // 2:
            if j == len(nums2) or (i < len(nums1) and nums1[i] <= nums2[j]):
                merged.append(nums1[i])
                i+=1
            elif j < len(nums2):
                merged.append(nums2[j])
                j+=1

        # if total length is odd, return the last element (which is middle element)
        if total_length % 2 == 1:
            return float(merged[-1])
        else: 
            # if even, return the average of the last two elements
            return (merged[-1] + merged[-2]) / 2.0
                