# time complexity: O(n)
# space complexity: O(n)
class Solution(object):
    def findShortestSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        # count frequency of each element
        count = Counter(nums)
        degree = max(count.values())

        # record first and last occurrence of each element
        left, right = {}, {}
        for i, x in enumerate(nums):
            left.setdefault(x, i)
            right[x] = i

        # compute minimal length among elements with max frequency
        min_len = len(nums)
        for x, freq in count.items():
            if freq == degree:
                curr_len = right[x] - left[x] + 1  # window size for x
                if curr_len < min_len:
                    min_len = curr_len

        return min_len