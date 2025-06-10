# time complexity: O(n)
# space complexity: O(1)
class Solution(object):
    def smallestRangeI(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        # initialize min and max
        low = float('inf')
        high = float('-inf')

        # find min and max in one traversal
        for num in nums:
            if num < low:
                low = num
            if num > high:
                high = num

        # compute the minimized range
        diff = (high-k) - (low+k)

        # if diff is negative, score is 0
        return diff if diff > 0 else 0