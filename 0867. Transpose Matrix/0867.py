# time complexity: O(m*n)
# space compleixty: O(m*n)
class Solution(object):
    def transpose(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[List[int]]
        """
        m, n = len(matrix), len(matrix[0])
        # return the transposed matrix
        return [[matrix[i][j] for i in range(m)] for j in range(n)]