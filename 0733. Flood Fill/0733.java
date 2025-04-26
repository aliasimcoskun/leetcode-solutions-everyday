// time complexity: O(m x n)
// space complexity: O(m x n)
class Solution {
    // DFS RECURSION ALGORITHM
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldColor = image[sr][sc];
        // if the starting pixel is already the target color, no work needed
        if (oldColor == color) return image;
        dfs(image, sr, sc, oldColor, color);
        return image;
    }

    private void dfs(int[][] img, int r, int c, int oldColor, int newColor) {
        // boundary check and color match check
        if (r < 0 || r >= img.length || c < 0 || c >= img[0].length) return;
        if (img[r][c] != oldColor) return;

        img[r][c] = newColor;          // fill current pixel
        // recurse on 4-connected neighbors
        dfs(img, r + 1, c, oldColor, newColor);
        dfs(img, r - 1, c, oldColor, newColor);
        dfs(img, r, c + 1, oldColor, newColor);
        dfs(img, r, c - 1, oldColor, newColor);
    }

}