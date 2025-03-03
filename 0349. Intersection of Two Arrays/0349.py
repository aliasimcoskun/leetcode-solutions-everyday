# time complexity: O(N + M) where N and M are the lengths of the two arrays.
# space complexity: O(N + M)
class Solution(object):
    def intersection(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]
        """
        # Convert both lists to sets to remove duplicates
        set1 = set(nums1)
        set2 = set(nums2)
        
        # Use set intersection to find common elements
        return list(set1 & set2)
        