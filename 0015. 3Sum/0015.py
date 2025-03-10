# time complexity: O(n^2)
# space complexity: O(n)
class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        nums.sort() # O(nlogn)
        result = []

        for i in range(len(nums) - 2):
            if i>0 and nums[i] == nums[i-1]:
                continue # skip duplicates for the first element
            
            left = i+1
            right = len(nums)-1

            while left < right:
                total = nums[i] + nums[left] + nums[right]

                if total == 0:
                    result.append([nums[i], nums[left], nums[right]])
                    left+=1
                    right-=1

                    while left < right and nums[left]==nums[left-1]:
                        left+=1 # skip duplicates for the second element
                    while left < right and nums[right]==nums[right+1]:
                        right-=1 # skip duplicates for the third element
                
                elif total < 0:
                    left+=1 # increase the sum
                else:
                    right-=1 # decrease the sum

        return result    
