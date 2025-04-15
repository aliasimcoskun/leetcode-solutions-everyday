# time complexity: O(n)
# space complexity: O(n)
class Solution(object):
    def findErrorNums(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        n = len(nums)
        # expected sum
        expected_sum = n*(n + 1) // 2 
        # actual sum
        actual_sum = sum(nums)  # O(n) time, O(1) space
        
        # find the duplicate number
        duplicate = None
        seen = set()
        for num in nums:
            if num in seen:
                duplicate = num  # duplicate found
            else:
                seen.add(num)
        
        # calculate the missing number
        missing = expected_sum - (actual_sum - duplicate)
        
        return [duplicate, missing]