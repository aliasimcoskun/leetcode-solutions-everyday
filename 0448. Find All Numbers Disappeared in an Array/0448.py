# time complexity: O(n)
# space complexity: O(1) - (except result list)
class Solution(object):
    def findDisappearedNumbers(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        # Marking step: 
        # To mark the presence of each number, make the corresponding index negative.
        for num in nums:
            index = abs(num) -1 # convert the value to index
            if nums[index] > 0:
                nums[index] = -nums[index]

        # indexes with positive remainders represent missing numbers
        result = []
        for i, num in enumerate(nums):
            if num > 0:
                result.append(i+1)

        return result
        