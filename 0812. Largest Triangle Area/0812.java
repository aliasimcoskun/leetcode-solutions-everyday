// time complexity: O(n^3), where n = points.length
// space complexity: O(1)
class Solution {
    public double largestTriangleArea(int[][] points) {
        int n = points.length;
        double maxArea = 0.0;
        // iterate over all triplets of points
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    // in 2D space, the absolute value of the cross product
                    // gives us the area of "twice" the triangle:
                    // 2 * area  =  ∣ ABx​ ⋅ ACy ​- ABy ​⋅ ACx​ ∣
                    double area2 = Math.abs(
                            (points[j][0] - points[i][0]) * (points[k][1] - points[i][1]) -
                                    (points[k][0] - points[i][0]) * (points[j][1] - points[i][1])
                    );
                    maxArea = Math.max(maxArea, area2 * 0.5);
                }
            }
        }
        return maxArea;
    }
}
