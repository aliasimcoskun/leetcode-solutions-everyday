class Solution(object):
    def maxAscendingSum(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if not nums:
            return 0

        best=total=nums[0]
        for i in range(0,len(nums)-1,1):
            if(nums[i]<nums[i+1]):
                total+=nums[i+1]
                print("total each step:", total)
            if((nums[i]>=nums[i+1]) or ((i+1)==len(nums)-1)):
                # if best < total:
                    # best = total
                best = max(best, total) # use this instead of above line
                total = nums[i+1]
                print("best:", best)
        return best