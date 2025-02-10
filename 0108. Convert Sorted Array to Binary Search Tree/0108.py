# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    # without recursion, using stack.
    def sortedArrayToBST(self, nums):
        """
        :type nums: List[int]
        :rtype: Optional[TreeNode]
        """
        if not nums:
            return None

        # initialize the subarray bounds for the full array.
        left, right = 0, len(nums) - 1
        # create the root node
        mid = (left + right) // 2
        root = TreeNode(nums[mid])
        
        # Stack stores tuples: (parent_node, subarray_left_index, subarray_right_index, child_direction)
        # child_direction is 'left' or 'right' to indicate whether the node to be created
        # should be attached to the parent's left or right pointer.
        stack = []
        # initial tasks 
        stack.append((root, left, mid - 1, 'left'))
        stack.append((root, mid + 1, right, 'right'))

        # process each pending subtree task until the stack is empty.
        while stack:
            parent, l, r, direction = stack.pop()
            if l > r:
                continue
            
            mid = (l + r) // 2
            # create a new node with the middle element.
            node = TreeNode(nums[mid])
            # attach the new node to its parent.
            if direction == 'left':
                parent.left = node
            else:
                parent.right = node
            
            # push tasks for the left and right children of the new node.
            stack.append((node, l, mid - 1, 'left'))
            stack.append((node, mid + 1, r, 'right'))

        return root
