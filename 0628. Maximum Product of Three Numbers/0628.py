# time complexity: O(nlogn) due to sorting
# space complexity: O(1)
class Solution(object):
    def maximumProduct(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        # sort the list
        nums.sort()
        # product of the three largest numbers
        product1 = nums[-1] * nums[-2] * nums[-3]
        # product of the two smallest numbers and the largest number
        product2 = nums[0] * nums[1] * nums[-1]

        return max(product1, product2)