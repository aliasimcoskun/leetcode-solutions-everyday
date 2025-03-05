# time complexity: O(n)
# space complexity: O(1)
class Solution(object):
    # solution by using set
    def thirdMax(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        top_three = set()

        for num in nums:
            top_three.add(num) # add every number to the set
            if len(top_three) > 3: # if the length is greater than 3
                top_three.remove(min(top_three)) # remove the smallest element
        
        # if there are 3 distinct number, return the minimum
        # else return the maximum
        if len(top_three) == 3:
            return min(top_three)
        else:
            return max(top_three)