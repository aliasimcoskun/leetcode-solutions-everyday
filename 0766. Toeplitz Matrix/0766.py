# time complexity: O(m*n)
# space complexity: O(n)
class Solution(object):
    # compare each row with the following row
    def isToeplitzMatrix(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: bool
        """
        # iterate over each pair of consecutive rows
        for i in range(len(matrix) - 1):
            row1 = matrix[i]
            row2 = matrix[i + 1]
            
            # take all but the last element of the upper row
            prefix = row1[:-1]
            # and all but the first element of the lower row
            suffix = row2[1:]
            
            # if these two lists differ, it's not Toeplitz
            if prefix != suffix:
                return False
        
        # every shifted pair matched
        return True