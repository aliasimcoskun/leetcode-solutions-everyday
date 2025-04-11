# time complexity: O(n)
# space complexity: O(1)
class Solution(object):
    def findMaxAverage(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: float
        """
        # calculate the sum of the first window of size k
        window_sum = sum(nums[:k])
        max_sum = window_sum
        
        # slide the window through the array, updating the sum in O(1) time per step
        for i in range(k, len(nums)):
            # remove the element leaving the window and add the new element
            window_sum += nums[i] - nums[i - k]
            # update max_sum if the current window sum is greater
            if window_sum > max_sum:
                max_sum = window_sum
        
        # return the maximum average by dividing the maximum sum by k
        return float(max_sum) / k