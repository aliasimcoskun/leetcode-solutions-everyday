# time complexity: O(m x n)
# space complexity: O(m x n)
class Solution(object):
    def imageSmoother(self, img):
        """
        :type img: List[List[int]]
        :rtype: List[List[int]]
        """
        # sizes
        m, n = len(img), len(img[0])
        # initialize result matrix with zeros
        result = [[0 for _ in range(n)] for _ in range(m)]

        # define 3x3 neighboring directions including the cell itself
        directions = [(-1,-1), (-1,0), (-1,1),
                      (0,-1),  (0,0),  (0,1),
                      (1,-1),  (1,0),  (1,1)]

        for i in range(m):
            for j in range(n):
                count = 0
                # traverse all valid neighbors
                for dx, dy in directions:
                    ni, nj = i + dx, j + dy
                    if 0 <= ni < m and 0 <= nj < n:
                        result[i][j] += img[ni][nj]
                        count += 1
                # store the floor of the average
                result[i][j] //= count

        return result
