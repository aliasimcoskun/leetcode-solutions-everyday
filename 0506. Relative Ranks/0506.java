// time complexity: O(n^2)
// space complexity: O(n)
class Solution {
    public String[] findRelativeRanks(int[] score) {
        // all the elements of score are unique
        // label the elements as their ranks.
        int n = score.length;

        // an array to store ranks
        int[] arr = new int[n];

        // calculate the ranks
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (score[i] > score[j])
                    arr[j]++;
            }
        }

        // result array for rank strings
        String[] results = new String[n];

        // assign medals or rank numbers based on position
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                results[i] = "Gold Medal";
            else if (arr[i] == 1)
                results[i] = "Silver Medal";
            else if (arr[i] == 2)
                results[i] = "Bronze Medal";
            else
                results[i] = String.valueOf(arr[i] + 1); // add 1 because ranks start from 1
        }

        return results;
    }
}