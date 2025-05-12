# time complexity: O(n), where n = len(s)
# space complexity: O(1)
class Solution(object):
    def numberOfLines(self, widths, s):
        """
        :type widths: List[int]
        :type s: str
        :rtype: List[int]
        """
        lines = 1      # start with one line
        cur = 0        # current line width
        for ch in s:
            w = widths[ord(ch) - ord('a')]  # get pixel width of ch
            # if adding this char would exceed 100px, wrap to new line
            if cur + w > 100:
                lines += 1
                cur = w     # this char starts the new line
            else:
                cur += w    # otherwise append to current line
        return [lines, cur]