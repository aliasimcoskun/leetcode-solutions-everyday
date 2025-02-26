# time complexity O(n)
# space complexity O(1)
class Solution(object):
    # gauss summation
    def missingNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        # sum = n(n+1)/2
        n = len(nums)
        expected_sum = n*(n+1)//2 # // returns the closest integer
    
        actual_sum = 0
        for num in nums:
            actual_sum += num # total of the numbers in the array

        return expected_sum - actual_sum # return the missing number