// time complexity: O(m*n)
// space complexity: O(m*n)
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        // return original matrix if new dimensions are invalid
        if (r < 1 || c < 1) return mat;

        int row = mat.length;
        int column = mat[0].length;

        // return original matrix if total elements don't match
        if (r*c != row*column) return mat;

        // create new reshaped matrix
        int[][] reshaped = new int[r][c];

        int x = 0; // current row in original matrix
        int y = 0; // current column in original matrix

        // fill the reshaped matrix
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                reshaped[i][j] = mat[x][y];
                y++;
                // move to next row if end of column is reached
                if (y == column) {
                    y = 0;
                    x++;
                }
            }
        }

        return reshaped;
    }
}
