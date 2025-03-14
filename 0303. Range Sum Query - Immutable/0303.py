# time complexity: O(n)
# space complexity: O(1)
class NumArray(object):

    def __init__(self, nums):
        """
        :type nums: List[int]
        """
        self._nums = nums

    def sumRange(self, left, right):
        """
        :type left: int
        :type right: int
        :rtype: int
        """
        result = 0
        for i in range(len(self._nums)):
            if left <= i and i <= right:
                result += self._nums[i]
        return result


# Your NumArray object will be instantiated and called as such:
# obj = NumArray(nums)
# param_1 = obj.sumRange(left,right)