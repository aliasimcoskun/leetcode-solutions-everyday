# time complexity: O(n^2), reversing + iterating each bit
# space complexity: O(n^2), for the new matrix 
class Solution(object):
    def flipAndInvertImage(self, image):
        """
        :type image: List[List[int]]
        :rtype: List[List[int]]
        """
        # for each row: reverse it then invert each bit by 1−bit
        return [[1 - bit for bit in row[::-1]] for row in image]
        # row[::-1]] -> reads the row list from start to finish