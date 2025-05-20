# time complexity: O(n) - two linear scans over the string
# space complexity: O(n)
class Solution(object):
    # two-pass
    def shortestToChar(self, s, c):
        """
        :type s: str
        :type c: str
        :rtype: List[int]
        """
        n = len(s)
        res = [0] * n
        prev = -n                    # position of last seen c (far left)
        
        # left -> right pass: distance to previous c
        for i in range(n):
            if s[i] == c:
                prev = i             # update last seen c
            res[i] = i - prev        # distance from i to last c on left
        
        prev = 2 * n                 # position of next c (far right)
        # right -> left pass: take min with next c on right
        for i in range(n-1, -1, -1):
            if s[i] == c:
                prev = i             # update next seen c
            res[i] = min(res[i], prev - i)
        
        return res