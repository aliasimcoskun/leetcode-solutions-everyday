# time complexity: O(n)
# space complexity: O(n)
class Solution(object):
    # a solution using stack
    def calPoints(self, operations):
        """
        :type operations: List[str]
        :rtype: int
        """
        # initialize stack to store scores
        stack = []
        # process each operation in the input list
        for op in operations:
            if op == "C":
                # remove the last score from the stack
                stack.pop()
            elif op == "D":
                # double the last score and push it onto the stack
                stack.append(stack[-1] * 2)
            elif op == "+":
                # sum the last two scores and push the result onto the stack
                stack.append(stack[-1] + stack[-2])
            else:
                # convert the string to an integer and push it onto the stack
                stack.append(int(op))
        # return the total sum of scores in the stack
        return sum(stack)