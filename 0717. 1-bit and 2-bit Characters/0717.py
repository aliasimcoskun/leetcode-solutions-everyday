# time complexity: O(n)
# space complexity: O(n)
class Solution(object):
    # dynamic programming
    def isOneBitCharacter(self, bits):
        """
        :type bits: List[int]
        :rtype: bool
        """
        n = len(bits)
        # "dp[i] == True" means bits[0:i] can be fully parsed
        dp = [False] * (n + 1)
        dp[0] = True

        for i in range(n):
            if not dp[i]:
                continue
            # if bits[i] == 0, we can take a 1-bit char (0)
            if bits[i] == 0:
                dp[i + 1] = True
            # if bits[i] == 1, we can take a 2-bit char (10 or 11)
            elif bits[i] == 1 and i + 1 < n:
                dp[i + 2] = True

        # we want to force the last 0 to be parsed as a 1-bit char
        return dp[n-1]
