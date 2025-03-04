# time complexity: O(n+m)
# space complexity: O(n+m)
class Solution(object):
    # hashmap solution
    def intersect(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]
        """

        # count the frequency
        freq = {}
        for num in nums1:
            freq[num] = freq.get(num, 0) + 1
        
        # find the intersection
        intersection = []
        for num in nums2:
            if freq.get(num, 0) > 0:
                intersection.append(num)
                freq[num] -= 1 # to handle duplicate

        return intersection
        