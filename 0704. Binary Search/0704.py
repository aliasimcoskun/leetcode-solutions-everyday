# time complexity: O(logn)
# space complexity: O(1)
class Solution(object):
    # iterative binary search on sorted list
    def search(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        left = 0
        right = len(nums) - 1
        while left <= right:
            mid = left + (right-left) // 2
            if nums[mid] == target:
                return mid               # found target
            elif nums[mid] < target:
                left = mid + 1           # search right half
            else:
                right = mid - 1          # search left half
        return -1                        # target not found