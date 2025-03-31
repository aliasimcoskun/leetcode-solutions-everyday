# time complexity: O(len(nums1) + len(nums2))
# space complexity: O(len(nums2))
class Solution(object):
    def nextGreaterElement(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]
        """
        # dictionary to store next greater element for each num in nums2.
        next_greater = {}
        stack = []
        
        # process nums2 to build the mapping.
        for num in nums2:
            # while stack is not empty and current num is greater than stack's top element.
            while stack and stack[-1] < num:
                next_greater[stack.pop()] = num
            stack.append(num)
        
        # build the result for nums1 using the mapping.
        result = []
        for num in nums1:
            if num in next_greater:
                result.append(next_greater[num])
            else:
                result.append(-1)
        return result
        # return [next_greater.get(num, -1) for num in nums1]