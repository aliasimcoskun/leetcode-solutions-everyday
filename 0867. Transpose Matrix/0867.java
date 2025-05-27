// time complexity: O(m*n)
// space complexity: O(m*n)
class Solution {
    public int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] transposed = new int[n][m];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }
}