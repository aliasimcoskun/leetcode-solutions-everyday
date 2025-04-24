# time complexity: O(n)
# space complexity: O(1)
class Solution(object):
    def minCostClimbingStairs(self, cost):
        """
        :type cost: List[int]
        :rtype: int
        """
        n = len(cost)
        prev2, prev1 = 0, 0  # costs to reach step i-2 and i-1
        
        for i in range(2, n+1):
            curr = min(prev1 + cost[i-1],
                       prev2 + cost[i-2])
            prev2, prev1 = prev1, curr
        
        return curr