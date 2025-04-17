# time complexity: O(n)
# space complexity: O(1)
class Solution(object):
    # two-pointer (sliding window) approach
    def findLengthOfLCIS(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if not nums:
            return 0
        
        max_len = 1        # max length so far
        left = 0           # start index of current window
        
        for right in range(1, len(nums)):
            # if sequence breaks, move left to right
            if nums[right] <= nums[right - 1]:
                left = right
            # window size is right‑left+1
            max_len = max(max_len, right - left + 1)
        
        return max_len