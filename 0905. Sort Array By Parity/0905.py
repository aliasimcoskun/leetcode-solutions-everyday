# time complexity: O(n)
# space complexity: O(n)
class Solution(object):
    # list comprehension, new list
    def sortArrayByParity(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        # build list: evens then odds
        evens = [x for x in nums if x % 2 == 0]
        odds  = [x for x in nums if x % 2 != 0]
        return evens + odds