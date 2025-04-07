// time complexity: O(k) where k is the number of operations
// space complexity: O(1)
class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        // if there are no operations, return the entire matrix area.
        if (ops == null || ops.length == 0) {
            return m * n;
        }

        // initialize minA and minB with the matrix dimensions.
        int minA = m;
        int minB = n;

        // loop over operations to find the smallest a and b.
        for (int[] op : ops) {
            minA = Math.min(minA, op[0]);
            minB = Math.min(minB, op[1]);
        }

        // the maximum value appears in the intersection area.
        return minA * minB;
    }
}