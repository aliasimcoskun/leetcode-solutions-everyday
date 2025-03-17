// time complexity: O(n*m)
// space compleixty: O(1)
class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // process only land cells
                if (grid[i][j] == 1) {
                    // check upward neighbor or top boundary
                    if (i == 0 || grid[i-1][j] == 0) perimeter++;

                    // check left neighbor or left boundary
                    if (j == 0 || grid[i][j-1] == 0) perimeter++;

                    // check downward neighbor or bottom boundary
                    if (i == rows - 1 || grid[i+1][j] == 0) perimeter++;

                    // check right neighbor or right boundary
                    if (j == cols - 1 || grid[i][j+1] == 0) perimeter++;
                }
            }
        }

        return perimeter;
    }
}