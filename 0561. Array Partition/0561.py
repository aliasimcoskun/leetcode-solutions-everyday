# time complexity: O(nlogn)
# space complexity: O(1)
class Solution(object):
    def arrayPairSum(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        nums.sort() # O(nlogn)

        maximum = 0
        # sum up the even indices
        for i in range(0,len(nums),2):
            maximum += nums[i]
        
        return maximum