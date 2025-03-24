# time complexity: O(m*n)
# space complexity: O(m*n)
class Solution(object):
    def matrixReshape(self, mat, r, c):
        """
        :type mat: List[List[int]]
        :type r: int
        :type c: int
        :rtype: List[List[int]]
        """
        # dimensions of the original matrix
        original_rows = len(mat)
        original_cols = len(mat[0])

        # if the number of elements is not the same:
        # reshaping is not possible.
        if original_rows * original_cols != r * c:
            return mat

        # all elements to a 1D list
        elements = []
        for i in range(original_rows):
            for j in range(original_cols):
                elements.append(mat[i][j])

        # new matrix
        reshaped = []
        index = 0
        for i in range(r):
            new_row = []
            for j in range(c):
                new_row.append(elements[index])
                index += 1
            reshaped.append(new_row)

        return reshaped