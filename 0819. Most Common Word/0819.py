# time complexity: O(N + B), where N is the length of the paragraph
# space compleixty: O(N + B), and B is the number of banned words
class Solution(object):
    def mostCommonWord(self, paragraph, banned):
        """
        :type paragraph: str
        :type banned: List[str]
        :rtype: str
        """
        # convert to lowercase
        para = paragraph.lower()
        # replace punctuation with spaces
        for ch in "!?',;.":
            para = para.replace(ch, " ")
        # split on whitespace to get words
        words = para.split()
        # build a set of banned words for fast lookup
        ban_set = set(banned)
        counts = {}
        # count each word if it is not banned
        for w in words:
            if w not in ban_set:
                counts[w] = counts.get(w, 0) + 1
        # return the word with the highest count
        # max(..., key=counts.get) finds the key with max value
        return max(counts, key=counts.get)