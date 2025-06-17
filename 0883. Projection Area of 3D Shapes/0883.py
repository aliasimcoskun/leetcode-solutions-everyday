# time complexity: O(n^2)
# space complexity: O(1)
class Solution(object):
    def projectionArea(self, grid):
        """
        :type grid: List[List[int]]
        :rtype: int
        """
        n = len(grid)
        top = 0
        front = 0
        side = 0

        # compute top (xy) and front (yz) projections
        for i in range(n):
            max_row = 0
            for j in range(n):
                v = grid[i][j]
                # top view: each non-zero tower contributes 1
                if v > 0:
                    top += 1
                # track the tallest tower in this row for front view
                if v > max_row:
                    max_row = v
            front += max_row

        # compute side (zx) projection by scanning columns manually
        for j in range(n):
            max_col = 0
            for i in range(n):
                v = grid[i][j]
                # track the tallest tower in this column
                if v > max_col:
                    max_col = v
            side += max_col

        return top + front + side