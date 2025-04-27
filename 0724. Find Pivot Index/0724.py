# time complexity: O(n)
# space complexity: O(1)
class Solution(object):
    def pivotIndex(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        total = sum(nums)     # total sum
        left_sum = 0
        for i, x in enumerate(nums):
            # right_sum = total − (left_sum + current)
            if left_sum == total - (left_sum + x):
                return i
            left_sum += x
        return -1