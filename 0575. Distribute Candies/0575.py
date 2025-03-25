# time complexity: O(n)
# space complexity: O(n) - (worst case)
class Solution(object):
    def distributeCandies(self, candyType):
        """
        :type candyType: List[int]
        :rtype: int
        """
        # unique number of candies
        unique_number = len(set(candyType))
        # max number of candies that can be eaten
        n = len(candyType) // 2

        return min(n, unique_number)
