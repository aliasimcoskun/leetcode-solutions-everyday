# time complexity: O(k) where k is the number of transactions in the ops list.
# space complexity: O(1)
class Solution(object):
    def maxCount(self, m, n, ops):
        """
        :type m: int
        :type n: int
        :type ops: List[List[int]]
        :rtype: int
        """
        # If there are no operations, return total cell count.
        if not ops:
            return m * n
        
        # Initially min_a and min_b are set as the dimensions of the matrix.
        min_a, min_b = m, n
        
        # Update min_a and min_b for each op.
        for a, b in ops:
            if a < min_a:
                min_a = a
            if b < min_b:
                min_b = b
        
        # The area defined by (min_a x min_b) contains the maximum integers.
        return min_a * min_b
        