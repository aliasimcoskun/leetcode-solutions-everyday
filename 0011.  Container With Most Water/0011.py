# time complexity: O(n)
# space complexity: O(1)
class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        left = 0
        right = len(height) - 1

        max_area = 0
        current_area = 0

        while left != right:
            current_area = min(height[left], height[right]) * (right-left)
            max_area = max(max_area, current_area)

            # move the shorter pointer
            if height[left] < height[right]:
                left+=1
            else:
                right-=1
        
        return max_area