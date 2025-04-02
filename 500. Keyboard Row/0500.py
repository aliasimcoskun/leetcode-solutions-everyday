# time complexity: O(n*m)
# space complexity: O(n+m)
class Solution(object):
    def findWords(self, words):
        """
        :type words: List[str]
        :rtype: List[str]
        """
        # use set
        row1 = set("qwertyuiop")
        row2 = set("asdfghjkl")
        row3 = set("zxcvbnm")

        result = []
        for word in words:
            lower_word = set(word.lower())  # ignore case
            if lower_word.issubset(row1) or lower_word.issubset(row2) or lower_word.issubset(row3):
                result.append(word)
        return result