// time complexity: O(n^2)
// space complexity: O(1)
public class Solution {
    // iterative loops
    public int projectionArea(int[][] grid) {
        int n = grid.length;
        int area = 0;
        // top & front projections in one pass over rows
        for (int i=0; i<n; i++) {
            int maxRow = 0;
            for (int j=0; j<n; j++) {
                if (grid[i][j] > 0) {
                    // top view: each non-zero stack casts a 1×1 shadow
                    area++;
                }
                // track maximum height in this row for front view
                maxRow = Math.max(maxRow, grid[i][j]);
            }
            // add row-max for front projection
            area += maxRow;
        }
        // side projection: max of each column
        for (int j=0; j<n; j++) {
            int maxCol = 0;
            for (int i=0; i<n; i++) {
                maxCol = Math.max(maxCol, grid[i][j]);
            }
            area += maxCol;
        }
        return area;
    }
}