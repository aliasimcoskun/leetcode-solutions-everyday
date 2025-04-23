// time complexity: O(n)
// space complexity: O(n)
class Solution {
    // dynamic programming
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        // dp[i] will hold the min cost to reach step i
        int[] dp = new int[n + 1];
        dp[0] = 0;  // start before step 0
        dp[1] = 0;  // or start before step 1

        for (int i = 2; i <= n; i++) {
            // either come from i-1 or i-2
            dp[i] = Math.min(dp[i - 1] + cost[i - 1],
                    dp[i - 2] + cost[i - 2]);
        }
        return dp[n];
    }
}
