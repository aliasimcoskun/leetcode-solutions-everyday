# time complexity: O(n)
# space complexity: O(1)
class Solution(object):
    def sortArrayByParityII(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        i, j = 0, 1              # even index pointer i, odd index pointer j
        n = len(nums)
        while i < n and j < n:
            if nums[i] % 2 == 0:
                i += 2           # correct even at even index, move to next even slot
            elif nums[j] % 2 == 1:
                j += 2           # correct odd at odd index, move to next odd slot
            else:
                # nums[i] is odd in even slot AND nums[j] is even in odd slot → swap them
                nums[i], nums[j] = nums[j], nums[i]
                i += 2
                j += 2
        return nums