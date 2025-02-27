# time complexity O(n)
# space complexity O(1)
class Solution(object):
    def moveZeroes(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        j=0 # pointer to track position of the next non-zero element
        for i in range(0,len(nums),1):
            if nums[i] != 0:
                if i != j: # if the pointers at different indexes, swap.
                    nums[i], nums[j] = nums[j], nums[i] # swap func. in python
                j+=1
        