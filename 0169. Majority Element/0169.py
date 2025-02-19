class Solution(object):
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        # it should be O(1) space complexity. (fixed amount of memory)
        # i'm gonna sort, so that it'll be easier to get result in O(1) space.
        nums.sort() # O(nlogn) time complexity
        # return nums[len(nums)//2] # no need more

        maximum=1
        for i in range (1, len(nums)):
            maximum+=1
            if maximum > len(nums)/2:
                return nums[i]
            if not nums[i] == nums[i-1]:
                maximum=1

        return nums[0]