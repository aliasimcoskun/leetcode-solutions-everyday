# time complexity: O(n)
# space complexity: O(1)
class Solution(object):
    def findPoisonedDuration(self, timeSeries, duration):
        """
        :type timeSeries: List[int]
        :type duration: int
        :rtype: int
        """
        total = 0
        # iterate through attacks except the last one
        for i in range(len(timeSeries) - 1):
            # minimum(duration, the gap to the next attack)
            total += min(duration, timeSeries[i+1] - timeSeries[i])
        # add poison duration for the last attack
        total += duration
        return total