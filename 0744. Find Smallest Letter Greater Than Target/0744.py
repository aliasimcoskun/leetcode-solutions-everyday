# time complexity: O(logn) - each recursive call halves the search range
# space complexity: O(logn) - recursion stack depth proportional to logn
class Solution(object):
    # recursive binary search
    def nextGreatestLetter(self, letters, target):
        """
        :type letters: List[str]
        :type target: str
        :rtype: str
        """
        # recursive helper returns the index of the first letter > target
        def helper(low, high):
            # base case: search interval is over
            if low > high:
                return low
            mid = low + (high-low)//2
            if letters[mid] <= target:
                # search right half if mid is not greater
                return helper(mid+1, high)
            else:
                # search left half if mid is greater
                return helper(low, mid-1) 

        idx = helper(0, len(letters)-1)

        if idx == len(letters):
            # if no greater letter found
            return letters[0]
        
        return letters[idx]
        
        # alternative way for 3 lines above
        # return letters[idx % len(letters)]