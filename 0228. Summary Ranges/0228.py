# Time Complexity: O(n) - Checks each element in the list once.
# Space Complexity: O(1)
class Solution(object):
    def summaryRanges(self, nums):
        """
        :type nums: List[int]
        :rtype: List[str]
        """
        if not nums:
            return []

        ranges = []
        start = nums[0]
        end = nums[0]

        # loop for each element in the list
        for num in nums[1:]:
            if end+1 == num: # if it's a consecutive number
                end = num
            else:
                if start == end: # if it's not a consecutive number
                    ranges.append(str(start))
                else: # append the consecutive numbers to the list
                    ranges.append(str(start) + "->" + str(end))
                start=num
                end=num

        # for the remaining part
        if not start == end:
            ranges.append(str(start) + "->" + str(end))
        else:
            ranges.append(str(start))

 
        return ranges