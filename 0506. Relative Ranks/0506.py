# time complexity: O(nlogn)
# space complexity: O(n)
class Solution(object):
    def findRelativeRanks(self, score):
        """
        :type score: List[int]
        :rtype: List[str]
        """
        # create an empty array of length n
        n = len(score)
        result = [""] * n

        # put each score in a list as (index, score)
        indexed_scores = []
        for i in range(n):
            indexed_scores.append((i, score[i]))

        # sort scores by the second element (x[1]) of each element in descending order
        # x = (0, 10) → x[1] = 10
        # x = (1, 3) → x[1] = 3
        indexed_scores.sort(key=lambda x: x[1], reverse=True)

        # medal names for top 3
        medals = ["Gold Medal", "Silver Medal", "Bronze Medal"]

        # assign ranks
        for rank in range(n):
            index = indexed_scores[rank][0]  # original index
            if rank < 3:
                result[index] = medals[rank]
            else:
                result[index] = str(rank + 1)
            
        return result