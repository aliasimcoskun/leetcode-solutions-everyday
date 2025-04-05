# time complexity: O(nlogn) due to sorting
# space complexity: O(1)    
class Solution(object):
    def findLHS(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        # sort the array
        nums.sort()
        longest = 0
        i = 0  # left pointer
        
        # use the right pointer to scan through the sorted list
        for j in range(len(nums)):
            # move left pointer until the difference is not more than 1
            while nums[j] - nums[i] > 1:
                i += 1
            # only update if the current window is harmonious (diff == 1)
            if nums[j] - nums[i] == 1:
                longest = max(longest, j - i + 1)
        return longest