# time complexity: O(n)
# space complexity: O(1)
class Solution(object):
    def canPlaceFlowers(self, flowerbed, n):
        """
        :type flowerbed: List[int]
        :type n: int
        :rtype: bool
        """
        # greedy simulation approach
        count = 0
        length = len(flowerbed)
        for i in range(length):
            # if current plot is empty and both neighbors are empty or it is at an edge.
            if (flowerbed[i] == 0 and 
                (i == 0 or flowerbed[i - 1] == 0) and 
                (i == length - 1 or flowerbed[i + 1] == 0)):
                flowerbed[i] = 1  # plant the flower.
                count += 1
                if count >= n:
                    return True
        return count >= n