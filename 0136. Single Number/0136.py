class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        # XOR operator.
        # 0 ^ a = a
        # a ^ a = 0
        result = 0
        for i in range(0,len(nums)):
            result = result ^ nums[i]
        return result
        
        