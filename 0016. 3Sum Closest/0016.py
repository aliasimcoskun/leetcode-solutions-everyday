# time complexity: O(n^2)
# space complexity: O(1)
class Solution(object):
    def threeSumClosest(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        nums.sort()
        closest = sum(nums[:3]) # initialize using sum of first three numbers

        for i in range(len(nums) - 2):
            left = i+1
            right = len(nums)-1

            # use two pointers to find best pair for nums[i]
            while left < right:
                current_sum = nums[i] + nums[left] + nums[right]

                # update closest
                if abs(target-current_sum) < abs(target-closest):
                    closest = current_sum
                
                # move pointers
                if current_sum < target:
                    left += 1
                else:
                    right -= 1
        
        return closest
                
