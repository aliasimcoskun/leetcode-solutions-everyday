# time complexity: O(n^3)
# space complexity: O(1) (except result)
class Solution(object):
    def fourSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[List[int]]
        """
        nums.sort()
        result = []
        n = len(nums)
        
        # First loop: iterate through the array to select the first number.
        for i in range(n - 3):
            # Skip duplicates for the first element.
            if i > 0 and nums[i] == nums[i - 1]:
                continue
            
            # Second loop: select the second number.
            for j in range(i + 1, n - 2):
                # Skip duplicates for the second element.
                if j > i + 1 and nums[j] == nums[j - 1]:
                    continue
                
                # Initialize two pointers for the third and fourth elements.
                left, right = j + 1, n - 1
                
                # Use two-pointer technique to find pairs that sum up with nums[i] and nums[j] to the target.
                while left < right:
                    total = nums[i] + nums[j] + nums[left] + nums[right]
                    if total == target:
                        # If the total matches the target, add the quadruplet to the result.
                        result.append([nums[i], nums[j], nums[left], nums[right]])
                        left += 1
                        right -= 1
                        
                        # Skip duplicates for the third element.
                        while left < right and nums[left] == nums[left - 1]:
                            left += 1
                        # Skip duplicates for the fourth element.
                        while left < right and nums[right] == nums[right + 1]:
                            right -= 1
                    elif total < target:
                        # If sum is less than target, move the left pointer to increase the sum.
                        left += 1
                    else:
                        # If sum is greater than target, move the right pointer to decrease the sum.
                        right -= 1
        return result
