# time complexity: O(N * L) where N = len(words), L = avg length of words
# space complexity: O(N * L) to store all transformations
class Solution(object):
    # list comprehension + set
    def uniqueMorseRepresentations(self, words):
        """
        :type words: List[str]
        :rtype: int
        """
        # morse code list for a-z
        morse = [".-","-...","-.-.","-..",".","..-.","--.","....","..",
                 ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
                 "...","-","..-","...-",".--","-..-","-.--","--.."]

        # build transformation for each word and collect unique ones
        transformations = {
            ''.join(morse[ord(c) - ord('a')] for c in word)
            for word in words
        }
        return len(transformations)