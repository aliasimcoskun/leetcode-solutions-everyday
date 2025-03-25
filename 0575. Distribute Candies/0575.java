// time complexity: O(nlogn)
// space complexity: O(1)
class Solution {
    public int distributeCandies(int[] candyType) {
        // n is even number
        int n = candyType.length;

        // if there are as many different numbers as n/2, return n/2.
        // if there are x different numbers where is x < n/2, return x.
        // if x > n/2, return n/2.

        Arrays.sort(candyType);
        int different=1;
        for(int i=1; i<n; i++){
            if(candyType[i] != candyType[i-1]) different++;
        }

        // return different < n/2 ? different : n/2;
        return Math.min(n/2, different);
    }
}