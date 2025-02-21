# time complexity O(n)
# space complexity O(min(n, k))
class Solution(object):
    def containsNearbyDuplicate(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: bool
        """
        # solution using dictionary (hashmap)
        check_dict = {} # to store the last seen index of each number

        for i in range(0, len(nums)):
            if nums[i] in check_dict and i - check_dict.get(nums[i]) <= k:
                return True
            check_dict[nums[i]]=i # add the element. if exist, update.

        return False
        