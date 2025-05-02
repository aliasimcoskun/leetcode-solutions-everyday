class Solution(object):
    def shortestCompletingWord(self, licensePlate, words):
        """
        :type licensePlate: str
        :type words: List[str]
        :rtype: str
        """
        # 1) Count letters in licensePlate (convert to lowercase, ignore digits/spaces)
        lp_count = {}
        for ch in licensePlate.lower():
            if ch.isalpha(): # check if it's letter or not
                lp_count[ch] = lp_count.get(ch, 0) + 1

        answer = None

        # 2) Check each word in the list
        for w in words:
            # skip if we already have a shorter or equal answer
            if answer is not None and len(w) >= len(answer):
                continue

            # 3) Count letters in the current word
            w_count = {}
            for ch in w:
                w_count[ch] = w_count.get(ch, 0) + 1

            # 4) Verify the word covers all required letters
            valid = True
            for letter, req in lp_count.items():
                if w_count.get(letter, 0) < req:
                    valid = False
                    break

            # 5) If valid, update the answer
            if valid:
                answer = w

        # 6) Return the found answer (guaranteed to exist)
        return answer