# time complexity: O(n)
# space complexity: O(1)
class Solution(object):
    def dominantIndex(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        # initialize top two values and index of largest
        max1, max2, index = -1, -1, -1
        for i, x in enumerate(nums):
            if x > max1:
                max2 = max1  # shift down previous max
                max1 = x
                index = i      # record new max index
            elif x > max2:
                max2 = x     # update second max
        # verify dominance condition
        return -1 if max1 < 2*max2 else index