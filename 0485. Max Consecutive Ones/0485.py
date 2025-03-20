# time complexity: O(n)
# space complexity: O(1)
class Solution(object):
    def findMaxConsecutiveOnes(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        current_max = 0
        maximum = 0

        for num in nums:
            if num == 1:
                current_max += 1
                maximum = max(maximum, current_max)
            else:
                current_max = 0

        return maximum