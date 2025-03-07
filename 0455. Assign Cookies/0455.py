# time complexity: O(n log n + m log m) -> Sorting both arrays dominates
# space complexity: O(1) -> No extra space 
class Solution(object):
    def findContentChildren(self, g, s):
        """
        :type g: List[int]
        :type s: List[int]
        :rtype: int
        """
        # sort the arrays
        g.sort()
        s.sort()
        
        child = 0 # pointer for children
        cookie = 0 # pointer for cookies

        while child < len(g) and cookie < len(s):
            if s[cookie] >= g[child]: # if cookies satisfies the greed
                child += 1
                cookie +=1
            else:                     # if not, next cookie, same child
                cookie +=1
        
        return child # number of content children